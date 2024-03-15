package com.oddfar.campus.huluwa.domain;

public class PlatformInfo {
    private String platform;

    private String name;

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.PlatformInfo))
            return false;
        com.oddfar.campus.huluwa.domain.PlatformInfo other = (com.oddfar.campus.huluwa.domain.PlatformInfo)o;
        if (!other.canEqual(this))
            return false;
        Object this$platform = getPlatform(), other$platform = other.getPlatform();
        if ((this$platform == null) ? (other$platform != null) : !this$platform.equals(other$platform))
            return false;
        Object this$name = getName(), other$name = other.getName();
        return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.PlatformInfo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $platform = getPlatform();
        result = result * 59 + (($platform == null) ? 43 : $platform.hashCode());
        Object $name = getName();
        return result * 59 + (($name == null) ? 43 : $name.hashCode());
    }

    public String toString() {
        return "PlatformInfo(platform=" + getPlatform() + ", name=" + getName() + ")";
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getName() {
        return this.name;
    }
}
