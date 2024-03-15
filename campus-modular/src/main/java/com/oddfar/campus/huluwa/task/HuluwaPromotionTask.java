package com.oddfar.campus.huluwa.task;


import com.oddfar.campus.huluwa.service.IPromotionService;
import com.oddfar.campus.huluwa.util.CommonUtils;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class HuluwaPromotionTask {
    private static final Logger log = LoggerFactory.getLogger(com.oddfar.campus.huluwa.task.HuluwaPromotionTask.class);

    @Resource
    private IPromotionService promotionService;

    @Scheduled(cron = "12 56 7 * * * ")
    public void appoint() {
        CommonUtils.sleepSeconds(120);
        try {
            log.info("开始预约所有用户");
            int cnt = this.promotionService.appointAll();
            log.info("完成预约所有用户，预约的用户数：{}", Integer.valueOf(cnt));
        } catch (Exception e) {
            log.error("预约所有用户出现异常", e);
        }
    }

    @Scheduled(cron = "23 36 10 * * * ")
    public void draw() {
        CommonUtils.sleepSeconds(120);
        try {
            log.info("开始查询摇号结果，检查是否中签");
            int cnt = this.promotionService.checkDraw();
            log.info("完成查询摇号结果，中签的用户数：{}", Integer.valueOf(cnt));
        } catch (Exception e) {
            log.error("查询摇号结果出现异常", e);
        }
    }
}