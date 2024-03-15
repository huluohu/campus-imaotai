package com.oddfar.campus.huluwa.domain;

import com.oddfar.campus.huluwa.enums.PlatformEnum;
import java.util.Date;

public class ActionLogInfo {
    private PlatformEnum platform;

    private String token;

    private String message;

    private Date stamp;

    public void setPlatform(PlatformEnum platform) {
        this.platform = platform;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStamp(Date stamp) {
        this.stamp = stamp;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.ActionLogInfo))
            return false;
        com.oddfar.campus.huluwa.domain.ActionLogInfo other = (com.oddfar.campus.huluwa.domain.ActionLogInfo)o;
        if (!other.canEqual(this))
            return false;
        Object this$platform = getPlatform(), other$platform = other.getPlatform();
        if ((this$platform == null) ? (other$platform != null) : !this$platform.equals(other$platform))
            return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token))
            return false;
        Object this$message = getMessage(), other$message = other.getMessage();
        if ((this$message == null) ? (other$message != null) : !this$message.equals(other$message))
            return false;
        Object this$stamp = getStamp(), other$stamp = other.getStamp();
        return !((this$stamp == null) ? (other$stamp != null) : !this$stamp.equals(other$stamp));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.ActionLogInfo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $platform = getPlatform();
        result = result * 59 + (($platform == null) ? 43 : $platform.hashCode());
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $message = getMessage();
        result = result * 59 + (($message == null) ? 43 : $message.hashCode());
        Object $stamp = getStamp();
        return result * 59 + (($stamp == null) ? 43 : $stamp.hashCode());
    }

    public String toString() {
        return "ActionLogInfo(platform=" + getPlatform() + ", token=" + getToken() + ", message=" + getMessage() + ", stamp=" + getStamp() + ")";
    }

    public PlatformEnum getPlatform() {
        return this.platform;
    }

    public String getToken() {
        return this.token;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getStamp() {
        return this.stamp;
    }

    public String getPlatformName() {
        if (this.platform == null)
            return null;
        return this.platform.getDesc();
    }
}
