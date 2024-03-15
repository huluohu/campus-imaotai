package com.oddfar.campus.huluwa.service;

import com.oddfar.campus.huluwa.domain.ChannelInfo;
import com.oddfar.campus.huluwa.enums.PlatformEnum;

public interface IChannelInfoService {
    Integer getChannelId(PlatformEnum paramPlatformEnum, String paramString);

    ChannelInfo getChannelInfo(PlatformEnum paramPlatformEnum, String paramString);
}
