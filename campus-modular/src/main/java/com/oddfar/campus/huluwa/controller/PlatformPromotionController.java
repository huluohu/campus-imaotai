package com.oddfar.campus.huluwa.controller;

import com.oddfar.campus.common.domain.R;
import com.oddfar.campus.huluwa.entity.PlatformPromotion;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import com.oddfar.campus.huluwa.service.IPlatformPromotionService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/huluwa/platform-promotion"})
public class PlatformPromotionController {
    @Resource
    private IPlatformPromotionService platformPromotionService;

    @PutMapping({"/refresh-all"})
    public R refreshAll() {
        return R.ok(Integer.valueOf(this.platformPromotionService.refreshAll()));
    }

    @GetMapping({"/refresh"})
    public R refresh(@RequestParam PlatformEnum platformEnum) {
        return R.ok(Boolean.valueOf(this.platformPromotionService.refreash(platformEnum)));
    }

    @GetMapping({"/page"})
    public R page(PlatformPromotion entity) {
        return R.ok().put(this.platformPromotionService.page(entity));
    }
}
