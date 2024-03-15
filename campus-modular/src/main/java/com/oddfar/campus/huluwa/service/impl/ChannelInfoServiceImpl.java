package com.oddfar.campus.huluwa.service.impl;

import com.oddfar.campus.huluwa.domain.ChannelInfo;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import com.oddfar.campus.huluwa.service.IChannelInfoService;
import com.oddfar.campus.huluwa.util.HuluwaHttpsUtils;
import org.springframework.stereotype.Service;

@Service
public class ChannelInfoServiceImpl implements IChannelInfoService {
    public Integer getChannelId(PlatformEnum platformEnum, String token) {
        ChannelInfo channelInfo = getChannelInfo(platformEnum, token);
        if (channelInfo == null)
            return null;
        return channelInfo.getChannelId();
    }

    public ChannelInfo getChannelInfo(PlatformEnum platformEnum, String token) {
        String uri = "/front-manager/api/get/getChannelInfoId";
        String content = String.format("{\"appId\":\"%s\"}", new Object[] { platformEnum.getAppId() });
        return (ChannelInfo)HuluwaHttpsUtils.sendPostResult(platformEnum, uri, content, token, ChannelInfo.class);
    }
}
