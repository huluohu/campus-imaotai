package com.oddfar.campus.huluwa.service.impl;

import com.oddfar.campus.common.utils.StringUtils;
import com.oddfar.campus.huluwa.entity.PlatformPromotion;
import com.oddfar.campus.huluwa.entity.UserPlatform;
import com.oddfar.campus.huluwa.service.IPlatformPromotionService;
import com.oddfar.campus.huluwa.service.IPromotionService;
import com.oddfar.campus.huluwa.service.IUserPlatformService;
import com.oddfar.campus.huluwa.util.CommonUtils;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PromotionServiceImpl implements IPromotionService {
    private static final Logger log = LoggerFactory.getLogger(com.oddfar.campus.huluwa.service.impl.PromotionServiceImpl.class);

    @Resource
    private IPlatformPromotionService platformPromotionService;

    @Resource
    private IUserPlatformService userPlatformService;

    public int appointAll() {
        this.platformPromotionService.refreshAll();
        long current = System.currentTimeMillis();
        log.info("{}", Long.valueOf(current));
        List<PlatformPromotion> appointPlatformList = this.platformPromotionService.selectByAppointTime(current);
        log.info("{}", Integer.valueOf(appointPlatformList.size()));
        int cnt = 0;
        for (PlatformPromotion platformPromotion : appointPlatformList) {
            List<UserPlatform> userPlatformList = this.userPlatformService.queryByPlatform(platformPromotion.getPlatform());
            log.info("[{}]{}", platformPromotion.getPlatformName(), Integer.valueOf(userPlatformList.size()));
            for (UserPlatform userPlatform : userPlatformList) {
                if (StringUtils.isBlank(userPlatform.getToken())) {
                    log.error("[{}]{}", userPlatform.getPlatformName(), userPlatform);
                    continue;
                }
                boolean result = this.userPlatformService.appoint(userPlatform.getPlatform(), userPlatform.getToken());
                if (result)
                    cnt++;
                CommonUtils.sleepMicroSeconds(900);
            }
            CommonUtils.sleepMicroSeconds(800);
        }
        return cnt;
    }

    public int checkDraw() {
        this.platformPromotionService.refreshAll();
        long current = System.currentTimeMillis();
        log.info("{}", Long.valueOf(current));
        List<PlatformPromotion> appointPlatformList = this.platformPromotionService.selectByDrawTime(current);
        int cnt = 0;
        for (PlatformPromotion platformPromotion : appointPlatformList) {
            List<UserPlatform> userPlatformList = this.userPlatformService.queryByPlatform(platformPromotion.getPlatform());
            log.info("[{}]{}", platformPromotion.getPlatformName(), Integer.valueOf(userPlatformList.size()));
            for (UserPlatform userPlatform : userPlatformList) {
                if (StringUtils.isBlank(userPlatform.getToken())) {
                    log.error("[{}]{}", userPlatform.getPlatformName(), userPlatform);
                    continue;
                }
                boolean result = this.userPlatformService.checkDraw(userPlatform.getPlatform(), userPlatform.getToken());
                if (result)
                    cnt++;
                CommonUtils.sleepMicroSeconds(900);
            }
            CommonUtils.sleepMicroSeconds(800);
        }
        return cnt;
    }
}
