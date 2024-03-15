package com.oddfar.campus.huluwa.service.impl;

import com.oddfar.campus.huluwa.domain.ChannelActivity;
import com.oddfar.campus.huluwa.domain.HuluwaResponse;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import com.oddfar.campus.huluwa.repository.HuluwaLogRepository;
import com.oddfar.campus.huluwa.service.IActionLogService;
import com.oddfar.campus.huluwa.service.IPromotionActivityService;
import com.oddfar.campus.huluwa.util.HuluwaHttpsUtils;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class PromotionActivityServiceImpl implements IPromotionActivityService {
    @Resource
    private IActionLogService actionLogService;

    public ChannelActivity queryChannelActivity(PlatformEnum platformEnum, String token) {
        String uri = "/front-manager/api/customer/promotion/channelActivity";
        String content = String.format("{}", new Object[0]);
        return (ChannelActivity)HuluwaHttpsUtils.sendPostResult(platformEnum, uri, content, token, ChannelActivity.class);
    }

    public boolean checkCustomerInQianggou(PlatformEnum platformEnum, String token, int activityId) {
        String uri = "/front-manager/api/customer/promotion/checkCustomerInQianggou";
        String content = String.format("{\"activityId\":%d}", new Object[] { Integer.valueOf(activityId) });
        HuluwaResponse response = HuluwaHttpsUtils.sendPost(platformEnum, uri, content, token);
        if (response == null) {
            HuluwaLogRepository.cacheActionLog(platformEnum, token, "查询预约结果失败：请求失败");
            return false;
        }
        HuluwaLogRepository.cacheActionLog(platformEnum, token, "用户预约状态："+ response.getMessage());
        return "true".equals(response.getData());
    }

    public boolean queryActivityIsDraw(PlatformEnum platformEnum, String token, int activityId) {
        String uri = "/front-manager/api/customer/promotion/queryActivityIsDraw";
        String content = String.format("{\"id\":%d}", new Object[] { Integer.valueOf(activityId) });
        HuluwaResponse response = HuluwaHttpsUtils.sendPost(platformEnum, uri, content, token);
        if (response == null) {
            HuluwaLogRepository.cacheActionLog(platformEnum, token, "查询摇号结果失败：请求失败");
            return false;
        }
        if (!response.isSuccess()) {
            HuluwaLogRepository.cacheActionLog(platformEnum, token, response.getMessage());
            return false;
        }
        return true;
    }

    public boolean appoint(PlatformEnum platformEnum, String token, int activityId, int channelId) {
        String uri = "/front-manager/api/customer/promotion/appoint";
        String content = String.format("{\"activityId\":%d,\"channelId\":%d}", new Object[] { Integer.valueOf(activityId), Integer.valueOf(channelId) });
        HuluwaResponse response = HuluwaHttpsUtils.sendPost(platformEnum, uri, content, token);
        if (response == null) {
            HuluwaLogRepository.cacheActionLog(platformEnum, token, "预约失败：请求是比啊");
            return false;
        }
        if (!response.isSuccess()) {
            HuluwaLogRepository.cacheActionLog(platformEnum, token, "预约结果："+ response.getMessage());
            return false;
        }
        HuluwaLogRepository.cacheActionLog(platformEnum, token, "预约成功！");
        return true;
    }
}
