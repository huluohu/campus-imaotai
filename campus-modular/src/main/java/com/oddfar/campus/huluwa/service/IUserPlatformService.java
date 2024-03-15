package com.oddfar.campus.huluwa.service;

import com.oddfar.campus.common.domain.PageResult;
import com.oddfar.campus.huluwa.domain.CustomerInfoDto;
import com.oddfar.campus.huluwa.entity.UserPlatform;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import java.util.List;

public interface IUserPlatformService {
    int insert(UserPlatform paramUserPlatform);

    UserPlatform findByToken(String paramString);

    UserPlatform findUniqueUser(PlatformEnum paramPlatformEnum, String paramString);

    List<UserPlatform> queryAll();

    List<UserPlatform> queryByPlatform(PlatformEnum paramPlatformEnum);

    PageResult<UserPlatform> page(UserPlatform paramUserPlatform);

    CustomerInfoDto addUserPlatform(PlatformEnum paramPlatformEnum, String paramString);

    boolean refreshUserPlatform(PlatformEnum paramPlatformEnum, String paramString);

    int refreshAllUserPlatform();

    int delete(Long paramLong);

    boolean appoint(PlatformEnum paramPlatformEnum, String paramString);

    boolean checkDraw(PlatformEnum paramPlatformEnum, String paramString);
}
