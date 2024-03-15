package com.oddfar.campus.huluwa.service;

import com.oddfar.campus.common.domain.PageResult;
import com.oddfar.campus.huluwa.entity.PlatformPromotion;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import java.util.List;

public interface IPlatformPromotionService {
    int insert(PlatformPromotion paramPlatformPromotion);

    PlatformPromotion findByPlatform(PlatformEnum paramPlatformEnum);

    int refreshAll();

    boolean refreash(PlatformEnum paramPlatformEnum);

    PageResult<PlatformPromotion> page(PlatformPromotion paramPlatformPromotion);

    List<PlatformPromotion> selectByAppointTime(long paramLong);

    List<PlatformPromotion> selectByDrawTime(long paramLong);
}
