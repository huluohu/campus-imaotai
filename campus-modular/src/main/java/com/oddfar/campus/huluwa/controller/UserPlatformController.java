package com.oddfar.campus.huluwa.controller;

import com.oddfar.campus.common.domain.R;
import com.oddfar.campus.huluwa.domain.BaseParam;
import com.oddfar.campus.huluwa.entity.UserPlatform;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import com.oddfar.campus.huluwa.service.IUserPlatformService;
import javax.annotation.Resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/huluwa/user-platform"})
public class UserPlatformController {
    @Resource
    private IUserPlatformService userPlatformService;
    @GetMapping({"/page"})
    public R page(UserPlatform userPlatform) {
        return R.ok().put(this.userPlatformService.page(userPlatform));
    }

    @PostMapping({"/add"})
    public R add(@RequestBody BaseParam baseParam) {
        return R.ok(this.userPlatformService.addUserPlatform(baseParam.getPlatform(), baseParam.getToken()));
    }

    @DeleteMapping({"/id/{id}"})
    public R add(@PathVariable("id") Long id) {
        return R.ok(Integer.valueOf(this.userPlatformService.delete(id)));
    }

    @PutMapping({"/refresh"})
    public R refresh(@RequestBody BaseParam baseParam) {
        return R.ok(Boolean.valueOf(this.userPlatformService.refreshUserPlatform(baseParam.getPlatform(), baseParam.getToken())));
    }

    @GetMapping({"/appoint"})
    public R appoint(PlatformEnum platformEnum, String token) {
        return R.ok(Boolean.valueOf(this.userPlatformService.appoint(platformEnum, token)));
    }
}
