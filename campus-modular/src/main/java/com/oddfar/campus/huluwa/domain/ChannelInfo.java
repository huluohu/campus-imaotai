package com.oddfar.campus.huluwa.domain;

import com.oddfar.campus.huluwa.domain.BaseResult;

public class ChannelInfo extends BaseResult {
    private String companyName;

    private Integer channelId;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String toString() {
        return "ChannelInfo(companyName=" + getCompanyName() + ", channelId=" + getChannelId() + ")";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.ChannelInfo))
            return false;
        com.oddfar.campus.huluwa.domain.ChannelInfo other = (com.oddfar.campus.huluwa.domain.ChannelInfo)o;
        if (!other.canEqual(this))
            return false;
        if (!super.equals(o))
            return false;
        Object this$channelId = getChannelId(), other$channelId = other.getChannelId();
        if ((this$channelId == null) ? (other$channelId != null) : !this$channelId.equals(other$channelId))
            return false;
        Object this$companyName = getCompanyName(), other$companyName = other.getCompanyName();
        return !((this$companyName == null) ? (other$companyName != null) : !this$companyName.equals(other$companyName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.ChannelInfo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Object $channelId = getChannelId();
        result = result * 59 + (($channelId == null) ? 43 : $channelId.hashCode());
        Object $companyName = getCompanyName();
        return result * 59 + (($companyName == null) ? 43 : $companyName.hashCode());
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public Integer getChannelId() {
        return this.channelId;
    }
}
