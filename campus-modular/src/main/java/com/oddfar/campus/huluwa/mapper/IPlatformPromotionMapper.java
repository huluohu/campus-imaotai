package com.oddfar.campus.huluwa.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.oddfar.campus.common.core.BaseMapperX;
import com.oddfar.campus.common.core.LambdaQueryWrapperX;
import com.oddfar.campus.common.domain.PageResult;
import com.oddfar.campus.huluwa.entity.ActionLog;
import com.oddfar.campus.huluwa.entity.PlatformPromotion;
import java.lang.invoke.SerializedLambda;
import java.util.List;
import java.util.concurrent.TimeUnit;

public interface IPlatformPromotionMapper extends BaseMapperX<PlatformPromotion> {
    default PageResult<PlatformPromotion> selectPage(PlatformPromotion entity) {
        return selectPage(new LambdaQueryWrapperX<PlatformPromotion>()
                .eqIfPresent(PlatformPromotion::getActivityId, entity.getActivityId())
                .eqIfPresent(PlatformPromotion::getPlatform, entity.getPlatform())

                .orderByDesc(PlatformPromotion::getPlatform));
    }

    default List<PlatformPromotion> selectForAppoint(long stamp) {
        return selectList(new LambdaQueryWrapperX<PlatformPromotion>()
                .le(PlatformPromotion::getAppointStartTime, Long.valueOf(stamp))
                .ge(PlatformPromotion::getAppointEndTime, Long.valueOf(stamp))
                .orderByDesc(PlatformPromotion::getPlatform));
    }

    default List<PlatformPromotion> selectForDraw(long stamp) {
        return selectList(new LambdaQueryWrapperX<PlatformPromotion>()
                .le(PlatformPromotion::getDrawTime, Long.valueOf(stamp))
                .ge(PlatformPromotion::getDrawTime, Long.valueOf(stamp - TimeUnit.HOURS.toMillis(1L)))
                .orderByDesc(PlatformPromotion::getPlatform));
    }
}
