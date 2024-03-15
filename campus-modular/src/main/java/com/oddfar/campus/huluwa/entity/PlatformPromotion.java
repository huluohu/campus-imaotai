package com.oddfar.campus.huluwa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oddfar.campus.common.utils.DateUtils;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PlatformPromotion {
    public void setId(Long id) {
        this.id = id;
    }

    public void setPlatform(PlatformEnum platform) {
        this.platform = platform;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setStamp(Date stamp) {
        this.stamp = stamp;
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
        if (!(o instanceof com.oddfar.campus.huluwa.entity.PlatformPromotion))
            return false;
        com.oddfar.campus.huluwa.entity.PlatformPromotion other = (com.oddfar.campus.huluwa.entity.PlatformPromotion)o;
        if (!other.canEqual(this))
            return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
            return false;
        Object this$activityId = getActivityId(), other$activityId = other.getActivityId();
        if ((this$activityId == null) ? (other$activityId != null) : !this$activityId.equals(other$activityId))
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
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum))
            return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize))
            return false;
        Object this$platform = getPlatform(), other$platform = other.getPlatform();
        if ((this$platform == null) ? (other$platform != null) : !this$platform.equals(other$platform))
            return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
            return false;
        Object this$stamp = getStamp(), other$stamp = other.getStamp();
        return !((this$stamp == null) ? (other$stamp != null) : !this$stamp.equals(other$stamp));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.entity.PlatformPromotion;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $activityId = getActivityId();
        result = result * 59 + (($activityId == null) ? 43 : $activityId.hashCode());
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
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $platform = getPlatform();
        result = result * 59 + (($platform == null) ? 43 : $platform.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $stamp = getStamp();
        return result * 59 + (($stamp == null) ? 43 : $stamp.hashCode());
    }

    public String toString() {
        return "PlatformPromotion(id=" + getId() + ", platform=" + getPlatform() + ", activityId=" + getActivityId() + ", name=" + getName() + ", startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", appointStartTime=" + getAppointStartTime() + ", appointEndTime=" + getAppointEndTime() + ", purchaseStartTime=" + getPurchaseStartTime() + ", purchaseEndTime=" + getPurchaseEndTime() + ", drawTime=" + getDrawTime() + ", stamp=" + getStamp() + ", pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ")";
    }

    private static final Integer PAGE_NUM = Integer.valueOf(1);

    private static final Integer PAGE_SIZE = Integer.valueOf(10);

    @TableId
    private Long id;

    private PlatformEnum platform;

    private Integer activityId;

    private String name;

    private Long startTime;

    private Long endTime;

    private Long appointStartTime;

    private Long appointEndTime;

    private Long purchaseStartTime;

    private Long purchaseEndTime;

    private Long drawTime;

    private Date stamp;

    public Long getId() {
        return this.id;
    }

    public PlatformEnum getPlatform() {
        return this.platform;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getName() {
        return this.name;
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

    public Date getStamp() {
        return this.stamp;
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

    public String getStartTimeFmt() {
        return DateUtils.parseStampToStr(DateUtils.MM_DD_HH_MM_SS, this.startTime);
    }

    public String getEndTimeFmt() {
        return DateUtils.parseStampToStr(DateUtils.MM_DD_HH_MM_SS, this.endTime);
    }

    public String getAppointStartTimeFmt() {
        return DateUtils.parseStampToStr(DateUtils.MM_DD_HH_MM_SS, this.appointStartTime);
    }

    public String getAppointEndTimeFmt() {
        return DateUtils.parseStampToStr(DateUtils.MM_DD_HH_MM_SS, this.appointEndTime);
    }

    public String getPurchaseStartTimeFmt() {
        return DateUtils.parseStampToStr(DateUtils.MM_DD_HH_MM_SS, this.purchaseStartTime);
    }

    public String getPurchaseEndTimeFmt() {
        return DateUtils.parseStampToStr(DateUtils.MM_DD_HH_MM_SS, this.purchaseEndTime);
    }

    public String getDrawTimeFmt() {
        return DateUtils.parseStampToStr(DateUtils.MM_DD_HH_MM_SS, this.drawTime);
    }

    public String getStampFmt() {
        if (this.stamp == null)
            return null;
        return DateUtils.parseDateToStr(DateUtils.MM_DD_HH_MM_SS, this.stamp);
    }
}
