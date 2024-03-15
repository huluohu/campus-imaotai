package com.oddfar.campus.huluwa.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.oddfar.campus.common.core.BaseMapperX;
import com.oddfar.campus.common.core.LambdaQueryWrapperX;
import com.oddfar.campus.common.domain.PageResult;
import com.oddfar.campus.huluwa.entity.UserPlatform;
import java.lang.invoke.SerializedLambda;

public interface IUserPlatformMapper extends BaseMapperX<UserPlatform> {
    default PageResult<UserPlatform> selectPage(UserPlatform userPlatform) {
        return selectPage(new LambdaQueryWrapperX<UserPlatform>()
                .eqIfPresent(UserPlatform::getPhone, userPlatform.getPhone())
                .eqIfPresent(UserPlatform::getPlatform, userPlatform.getPlatform())
                .likeIfPresent(UserPlatform::getNickName, userPlatform.getNickName())
                .likeIfPresent(UserPlatform::getRealName, userPlatform.getRealName())

                .orderByDesc(UserPlatform::getStamp));
    }
}
