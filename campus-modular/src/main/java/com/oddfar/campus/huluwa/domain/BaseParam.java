package com.oddfar.campus.huluwa.domain;

import com.oddfar.campus.huluwa.enums.PlatformEnum;

public class BaseParam {
    private PlatformEnum platform;

    private String token;

    public void setPlatform(PlatformEnum platform) {
        this.platform = platform;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.BaseParam))
            return false;
        com.oddfar.campus.huluwa.domain.BaseParam other = (com.oddfar.campus.huluwa.domain.BaseParam)o;
        if (!other.canEqual(this))
            return false;
        Object this$platform = getPlatform(), other$platform = other.getPlatform();
        if ((this$platform == null) ? (other$platform != null) : !this$platform.equals(other$platform))
            return false;
        Object this$token = getToken(), other$token = other.getToken();
        return !((this$token == null) ? (other$token != null) : !this$token.equals(other$token));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.BaseParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $platform = getPlatform();
        result = result * 59 + (($platform == null) ? 43 : $platform.hashCode());
        Object $token = getToken();
        return result * 59 + (($token == null) ? 43 : $token.hashCode());
    }

    public String toString() {
        return "BaseParam(platform=" + getPlatform() + ", token=" + getToken() + ")";
    }

    public PlatformEnum getPlatform() {
        return this.platform;
    }

    public String getToken() {
        return this.token;
    }
}
