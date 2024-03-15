package com.oddfar.campus.huluwa.controller;


import com.oddfar.campus.common.domain.R;
import com.oddfar.campus.huluwa.entity.ActionLog;
import com.oddfar.campus.huluwa.service.IActionLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping({"/huluwa/action-log"})
public class ActionLogController {
    @Resource
    private IActionLogService actionLogService;

    @GetMapping({"/page"})
    public R page(ActionLog entity) {
        return R.ok().put(this.actionLogService.page(entity));
    }
}
