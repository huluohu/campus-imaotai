package com.oddfar.campus.huluwa.controller;

import com.oddfar.campus.common.domain.R;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import com.oddfar.campus.huluwa.service.ICustomerService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/huluwa/customer"})
public class CustomerController {
    @Resource
    private ICustomerService customerService;

    @GetMapping({"/info"})
    public R info(PlatformEnum platformEnum, String token) {
        return R.ok(this.customerService.queryInfo(platformEnum, token));
    }
}
