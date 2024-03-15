package com.oddfar.campus.huluwa.controller;

import com.oddfar.campus.common.domain.R;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import com.oddfar.campus.huluwa.service.IPromotionActivityService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/huluwa/promotion-activity"})
public class PromotionActivityController {
    @Resource
    private IPromotionActivityService promotionActivityService;

    @GetMapping({"/channel-activity"})
    public R channelActivity(PlatformEnum platformEnum, String token) {
        return R.ok(this.promotionActivityService.queryChannelActivity(platformEnum, token));
    }

    @GetMapping({"/check-customer-in-qianggou"})
    public R customerInQianggou(PlatformEnum platformEnum, String token, int activityId) {
        return R.ok(Boolean.valueOf(this.promotionActivityService.checkCustomerInQianggou(platformEnum, token, activityId)));
    }

    @GetMapping({"/activity-is-draw"})
    public R activityIsDraw(PlatformEnum platformEnum, String token, int activityId) {
        return R.ok(Boolean.valueOf(this.promotionActivityService.queryActivityIsDraw(platformEnum, token, activityId)));
    }

    @GetMapping({"/appoint"})
    public R appoint(PlatformEnum platformEnum, String token, int activityId, int channelId) {
        return R.ok(Boolean.valueOf(this.promotionActivityService.appoint(platformEnum, token, activityId, channelId)));
    }
}
