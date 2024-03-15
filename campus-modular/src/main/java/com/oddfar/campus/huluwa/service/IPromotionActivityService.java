package com.oddfar.campus.huluwa.service;

import com.oddfar.campus.huluwa.domain.ChannelActivity;
import com.oddfar.campus.huluwa.enums.PlatformEnum;

public interface IPromotionActivityService {
    ChannelActivity queryChannelActivity(PlatformEnum paramPlatformEnum, String paramString);

    boolean checkCustomerInQianggou(PlatformEnum paramPlatformEnum, String paramString, int paramInt);

    boolean queryActivityIsDraw(PlatformEnum paramPlatformEnum, String paramString, int paramInt);

    boolean appoint(PlatformEnum paramPlatformEnum, String paramString, int paramInt1, int paramInt2);
}
