package com.oddfar.campus.huluwa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oddfar.campus.common.domain.BaseEntity;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@TableName("user_platform")
public class UserPlatform extends BaseEntity {
    private static final Integer PAGE_NUM = Integer.valueOf(1);

    private static final Integer PAGE_SIZE = Integer.valueOf(10);

    @TableId
    private Long id;

    private String phone;

    private PlatformEnum platform;

    private String token;

    private String nickName;

    private String realName;

    private Date stamp;

    private Integer status;

    private String message;

    public Long getId() {
        return this.id;
    }

    public String getPhone() {
        return this.phone;
    }

    public PlatformEnum getPlatform() {
        return this.platform;
    }

    public String getToken() {
        return this.token;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getRealName() {
        return this.realName;
    }

    public Date getStamp() {
        return this.stamp;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    @NotNull(message = "页码不能为空")
    @Min(value = 1L, message = "页码最小值为1")
    @TableField(exist = false)
    @JsonIgnore
    private Integer pageNum = PAGE_NUM;

    public Integer getPageNum() {
        return this.pageNum;
    }

    @NotNull(message = "每页条数不能为空" )
    @Min(value = 1L, message = "每页条数最小值为1")
    @Max(value = 100L, message = "每页条数最大值为100")
    @TableField(exist = false)
    @JsonIgnore
    private Integer pageSize = PAGE_SIZE;

    public Integer getPageSize() {
        return this.pageSize;
    }

    public String getPlatformName() {
        if (this.platform == null)
            return null;
        return this.platform.getDesc();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPlatform(PlatformEnum platform) {
        this.platform = platform;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setStamp(Date stamp) {
        this.stamp = stamp;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @JsonIgnore
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    @JsonIgnore
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
