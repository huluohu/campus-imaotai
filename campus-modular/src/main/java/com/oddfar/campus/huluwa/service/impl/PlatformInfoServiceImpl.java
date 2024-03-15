package com.oddfar.campus.huluwa.service.impl;

import com.oddfar.campus.huluwa.domain.PlatformInfo;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import com.oddfar.campus.huluwa.service.IPlatformInfoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PlatformInfoServiceImpl implements IPlatformInfoService {
    public List<PlatformInfo> queryAll() {
        List<PlatformInfo> list = new ArrayList<>();
        for (PlatformEnum PlatformEnum : PlatformEnum.values()) {
            PlatformInfo platformInfo = new PlatformInfo();
            platformInfo.setPlatform(PlatformEnum.toString());
            platformInfo.setName(PlatformEnum.getDesc());
            list.add(platformInfo);
        }
        return list;
    }
}
