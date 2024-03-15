package com.oddfar.campus.huluwa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@TableName("user_platform")
public class UserPlatform {
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

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.entity.UserPlatform))
            return false;
        com.oddfar.campus.huluwa.entity.UserPlatform other = (com.oddfar.campus.huluwa.entity.UserPlatform)o;
        if (!other.canEqual(this))
            return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status))
            return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum))
            return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize))
            return false;
        Object this$phone = getPhone(), other$phone = other.getPhone();
        if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
            return false;
        Object this$platform = getPlatform(), other$platform = other.getPlatform();
        if ((this$platform == null) ? (other$platform != null) : !this$platform.equals(other$platform))
            return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token))
            return false;
        Object this$nickName = getNickName(), other$nickName = other.getNickName();
        if ((this$nickName == null) ? (other$nickName != null) : !this$nickName.equals(other$nickName))
            return false;
        Object this$realName = getRealName(), other$realName = other.getRealName();
        if ((this$realName == null) ? (other$realName != null) : !this$realName.equals(other$realName))
            return false;
        Object this$stamp = getStamp(), other$stamp = other.getStamp();
        if ((this$stamp == null) ? (other$stamp != null) : !this$stamp.equals(other$stamp))
            return false;
        Object this$message = getMessage(), other$message = other.getMessage();
        return !((this$message == null) ? (other$message != null) : !this$message.equals(other$message));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.entity.UserPlatform;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $phone = getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        Object $platform = getPlatform();
        result = result * 59 + (($platform == null) ? 43 : $platform.hashCode());
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $nickName = getNickName();
        result = result * 59 + (($nickName == null) ? 43 : $nickName.hashCode());
        Object $realName = getRealName();
        result = result * 59 + (($realName == null) ? 43 : $realName.hashCode());
        Object $stamp = getStamp();
        result = result * 59 + (($stamp == null) ? 43 : $stamp.hashCode());
        Object $message = getMessage();
        return result * 59 + (($message == null) ? 43 : $message.hashCode());
    }

    public String toString() {
        return "UserPlatform(id=" + getId() + ", phone=" + getPhone() + ", platform=" + getPlatform() + ", token=" + getToken() + ", nickName=" + getNickName() + ", realName=" + getRealName() + ", stamp=" + getStamp() + ", status=" + getStatus() + ", message=" + getMessage() + ", pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ")";
    }

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
}
