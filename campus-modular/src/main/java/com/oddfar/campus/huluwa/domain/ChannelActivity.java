package com.oddfar.campus.huluwa.domain;

import com.oddfar.campus.huluwa.domain.BaseResult;

public class ChannelActivity extends BaseResult {
    private Integer id;

    private String name;

    private Integer playMode;

    private Integer isAppoint;

    private Integer appointCounts;

    private Long startTime;

    private Long endTime;

    private Long appointStartTime;

    private Long appointEndTime;

    private Long purchaseStartTime;

    private Long purchaseEndTime;

    private Long drawTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayMode(Integer playMode) {
        this.playMode = playMode;
    }

    public void setIsAppoint(Integer isAppoint) {
        this.isAppoint = isAppoint;
    }

    public void setAppointCounts(Integer appointCounts) {
        this.appointCounts = appointCounts;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setAppointStartTime(Long appointStartTime) {
        this.appointStartTime = appointStartTime;
    }

    public void setAppointEndTime(Long appointEndTime) {
        this.appointEndTime = appointEndTime;
    }

    public void setPurchaseStartTime(Long purchaseStartTime) {
        this.purchaseStartTime = purchaseStartTime;
    }

    public void setPurchaseEndTime(Long purchaseEndTime) {
        this.purchaseEndTime = purchaseEndTime;
    }

    public void setDrawTime(Long drawTime) {
        this.drawTime = drawTime;
    }

    public String toString() {
        return "ChannelActivity(id=" + getId() + ", name=" + getName() + ", playMode=" + getPlayMode() + ", isAppoint=" + getIsAppoint() + ", appointCounts=" + getAppointCounts() + ", startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", appointStartTime=" + getAppointStartTime() + ", appointEndTime=" + getAppointEndTime() + ", purchaseStartTime=" + getPurchaseStartTime() + ", purchaseEndTime=" + getPurchaseEndTime() + ", drawTime=" + getDrawTime() + ")";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.ChannelActivity))
            return false;
        com.oddfar.campus.huluwa.domain.ChannelActivity other = (com.oddfar.campus.huluwa.domain.ChannelActivity)o;
        if (!other.canEqual(this))
            return false;
        if (!super.equals(o))
            return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
            return false;
        Object this$playMode = getPlayMode(), other$playMode = other.getPlayMode();
        if ((this$playMode == null) ? (other$playMode != null) : !this$playMode.equals(other$playMode))
            return false;
        Object this$isAppoint = getIsAppoint(), other$isAppoint = other.getIsAppoint();
        if ((this$isAppoint == null) ? (other$isAppoint != null) : !this$isAppoint.equals(other$isAppoint))
            return false;
        Object this$appointCounts = getAppointCounts(), other$appointCounts = other.getAppointCounts();
        if ((this$appointCounts == null) ? (other$appointCounts != null) : !this$appointCounts.equals(other$appointCounts))
            return false;
        Object this$startTime = getStartTime(), other$startTime = other.getStartTime();
        if ((this$startTime == null) ? (other$startTime != null) : !this$startTime.equals(other$startTime))
            return false;
        Object this$endTime = getEndTime(), other$endTime = other.getEndTime();
        if ((this$endTime == null) ? (other$endTime != null) : !this$endTime.equals(other$endTime))
            return false;
        Object this$appointStartTime = getAppointStartTime(), other$appointStartTime = other.getAppointStartTime();
        if ((this$appointStartTime == null) ? (other$appointStartTime != null) : !this$appointStartTime.equals(other$appointStartTime))
            return false;
        Object this$appointEndTime = getAppointEndTime(), other$appointEndTime = other.getAppointEndTime();
        if ((this$appointEndTime == null) ? (other$appointEndTime != null) : !this$appointEndTime.equals(other$appointEndTime))
            return false;
        Object this$purchaseStartTime = getPurchaseStartTime(), other$purchaseStartTime = other.getPurchaseStartTime();
        if ((this$purchaseStartTime == null) ? (other$purchaseStartTime != null) : !this$purchaseStartTime.equals(other$purchaseStartTime))
            return false;
        Object this$purchaseEndTime = getPurchaseEndTime(), other$purchaseEndTime = other.getPurchaseEndTime();
        if ((this$purchaseEndTime == null) ? (other$purchaseEndTime != null) : !this$purchaseEndTime.equals(other$purchaseEndTime))
            return false;
        Object this$drawTime = getDrawTime(), other$drawTime = other.getDrawTime();
        if ((this$drawTime == null) ? (other$drawTime != null) : !this$drawTime.equals(other$drawTime))
            return false;
        Object this$name = getName(), other$name = other.getName();
        return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.ChannelActivity;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $playMode = getPlayMode();
        result = result * 59 + (($playMode == null) ? 43 : $playMode.hashCode());
        Object $isAppoint = getIsAppoint();
        result = result * 59 + (($isAppoint == null) ? 43 : $isAppoint.hashCode());
        Object $appointCounts = getAppointCounts();
        result = result * 59 + (($appointCounts == null) ? 43 : $appointCounts.hashCode());
        Object $startTime = getStartTime();
        result = result * 59 + (($startTime == null) ? 43 : $startTime.hashCode());
        Object $endTime = getEndTime();
        result = result * 59 + (($endTime == null) ? 43 : $endTime.hashCode());
        Object $appointStartTime = getAppointStartTime();
        result = result * 59 + (($appointStartTime == null) ? 43 : $appointStartTime.hashCode());
        Object $appointEndTime = getAppointEndTime();
        result = result * 59 + (($appointEndTime == null) ? 43 : $appointEndTime.hashCode());
        Object $purchaseStartTime = getPurchaseStartTime();
        result = result * 59 + (($purchaseStartTime == null) ? 43 : $purchaseStartTime.hashCode());
        Object $purchaseEndTime = getPurchaseEndTime();
        result = result * 59 + (($purchaseEndTime == null) ? 43 : $purchaseEndTime.hashCode());
        Object $drawTime = getDrawTime();
        result = result * 59 + (($drawTime == null) ? 43 : $drawTime.hashCode());
        Object $name = getName();
        return result * 59 + (($name == null) ? 43 : $name.hashCode());
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPlayMode() {
        return this.playMode;
    }

    public Integer getIsAppoint() {
        return this.isAppoint;
    }

    public Integer getAppointCounts() {
        return this.appointCounts;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public Long getAppointStartTime() {
        return this.appointStartTime;
    }

    public Long getAppointEndTime() {
        return this.appointEndTime;
    }

    public Long getPurchaseStartTime() {
        return this.purchaseStartTime;
    }

    public Long getPurchaseEndTime() {
        return this.purchaseEndTime;
    }

    public Long getDrawTime() {
        return this.drawTime;
    }
}
