package com.oddfar.campus.huluwa.service;


import com.oddfar.campus.common.domain.PageResult;
import com.oddfar.campus.huluwa.domain.ActionLogInfo;
import com.oddfar.campus.huluwa.entity.ActionLog;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import java.util.Date;
import java.util.List;

public interface IActionLogService {
    int insert(PlatformEnum paramPlatformEnum, String paramString1, String paramString2, Date paramDate);

    int insert(List<ActionLogInfo> paramList);

    int insert(ActionLog paramActionLog);

    PageResult<ActionLog> page(ActionLog paramActionLog);
}
