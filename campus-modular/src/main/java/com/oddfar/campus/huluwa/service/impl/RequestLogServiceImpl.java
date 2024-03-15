package com.oddfar.campus.huluwa.service.impl;

import com.oddfar.campus.huluwa.entity.RequestLog;
import com.oddfar.campus.huluwa.mapper.IRequestLogMapper;
import com.oddfar.campus.huluwa.service.IRequestLogService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class RequestLogServiceImpl implements IRequestLogService {
    @Resource
    private IRequestLogMapper requestLogMapper;

    public int insert(RequestLog requestLog) {
        return this.requestLogMapper.insert(requestLog);
    }
}
