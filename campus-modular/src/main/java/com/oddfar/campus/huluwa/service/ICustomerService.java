package com.oddfar.campus.huluwa.service;

import com.oddfar.campus.huluwa.domain.CustomerInfo;
import com.oddfar.campus.huluwa.enums.PlatformEnum;

public interface ICustomerService {
    CustomerInfo queryInfo(PlatformEnum paramPlatformEnum, String paramString);
}
