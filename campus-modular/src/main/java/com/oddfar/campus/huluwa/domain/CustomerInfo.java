package com.oddfar.campus.huluwa.domain;

import com.oddfar.campus.huluwa.domain.BaseResult;

public class CustomerInfo extends BaseResult {
    private String openId;

    private String headUrl;

    private String realName;

    private Boolean b2b;

    private Boolean isReadNotice;

    private String phone;

    private Boolean isRealNameAuth;

    private String idcard;

    private String nickname;

    private Integer custType;

    private Boolean phoneIsBind;

    private Boolean isModifyAuth;

    private String status;

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setB2b(Boolean b2b) {
        this.b2b = b2b;
    }

    public void setIsReadNotice(Boolean isReadNotice) {
        this.isReadNotice = isReadNotice;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIsRealNameAuth(Boolean isRealNameAuth) {
        this.isRealNameAuth = isRealNameAuth;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCustType(Integer custType) {
        this.custType = custType;
    }

    public void setPhoneIsBind(Boolean phoneIsBind) {
        this.phoneIsBind = phoneIsBind;
    }

    public void setIsModifyAuth(Boolean isModifyAuth) {
        this.isModifyAuth = isModifyAuth;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "CustomerInfo(openId=" + getOpenId() + ", headUrl=" + getHeadUrl() + ", realName=" + getRealName() + ", b2b=" + getB2b() + ", isReadNotice=" + getIsReadNotice() + ", phone=" + getPhone() + ", isRealNameAuth=" + getIsRealNameAuth() + ", idcard=" + getIdcard() + ", nickname=" + getNickname() + ", custType=" + getCustType() + ", phoneIsBind=" + getPhoneIsBind() + ", isModifyAuth=" + getIsModifyAuth() + ", status=" + getStatus() + ")";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.CustomerInfo))
            return false;
        com.oddfar.campus.huluwa.domain.CustomerInfo other = (com.oddfar.campus.huluwa.domain.CustomerInfo)o;
        if (!other.canEqual(this))
            return false;
        if (!super.equals(o))
            return false;
        Object this$b2b = getB2b(), other$b2b = other.getB2b();
        if ((this$b2b == null) ? (other$b2b != null) : !this$b2b.equals(other$b2b))
            return false;
        Object this$isReadNotice = getIsReadNotice(), other$isReadNotice = other.getIsReadNotice();
        if ((this$isReadNotice == null) ? (other$isReadNotice != null) : !this$isReadNotice.equals(other$isReadNotice))
            return false;
        Object this$isRealNameAuth = getIsRealNameAuth(), other$isRealNameAuth = other.getIsRealNameAuth();
        if ((this$isRealNameAuth == null) ? (other$isRealNameAuth != null) : !this$isRealNameAuth.equals(other$isRealNameAuth))
            return false;
        Object this$custType = getCustType(), other$custType = other.getCustType();
        if ((this$custType == null) ? (other$custType != null) : !this$custType.equals(other$custType))
            return false;
        Object this$phoneIsBind = getPhoneIsBind(), other$phoneIsBind = other.getPhoneIsBind();
        if ((this$phoneIsBind == null) ? (other$phoneIsBind != null) : !this$phoneIsBind.equals(other$phoneIsBind))
            return false;
        Object this$isModifyAuth = getIsModifyAuth(), other$isModifyAuth = other.getIsModifyAuth();
        if ((this$isModifyAuth == null) ? (other$isModifyAuth != null) : !this$isModifyAuth.equals(other$isModifyAuth))
            return false;
        Object this$openId = getOpenId(), other$openId = other.getOpenId();
        if ((this$openId == null) ? (other$openId != null) : !this$openId.equals(other$openId))
            return false;
        Object this$headUrl = getHeadUrl(), other$headUrl = other.getHeadUrl();
        if ((this$headUrl == null) ? (other$headUrl != null) : !this$headUrl.equals(other$headUrl))
            return false;
        Object this$realName = getRealName(), other$realName = other.getRealName();
        if ((this$realName == null) ? (other$realName != null) : !this$realName.equals(other$realName))
            return false;
        Object this$phone = getPhone(), other$phone = other.getPhone();
        if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone))
            return false;
        Object this$idcard = getIdcard(), other$idcard = other.getIdcard();
        if ((this$idcard == null) ? (other$idcard != null) : !this$idcard.equals(other$idcard))
            return false;
        Object this$nickname = getNickname(), other$nickname = other.getNickname();
        if ((this$nickname == null) ? (other$nickname != null) : !this$nickname.equals(other$nickname))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.CustomerInfo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Object $b2b = getB2b();
        result = result * 59 + (($b2b == null) ? 43 : $b2b.hashCode());
        Object $isReadNotice = getIsReadNotice();
        result = result * 59 + (($isReadNotice == null) ? 43 : $isReadNotice.hashCode());
        Object $isRealNameAuth = getIsRealNameAuth();
        result = result * 59 + (($isRealNameAuth == null) ? 43 : $isRealNameAuth.hashCode());
        Object $custType = getCustType();
        result = result * 59 + (($custType == null) ? 43 : $custType.hashCode());
        Object $phoneIsBind = getPhoneIsBind();
        result = result * 59 + (($phoneIsBind == null) ? 43 : $phoneIsBind.hashCode());
        Object $isModifyAuth = getIsModifyAuth();
        result = result * 59 + (($isModifyAuth == null) ? 43 : $isModifyAuth.hashCode());
        Object $openId = getOpenId();
        result = result * 59 + (($openId == null) ? 43 : $openId.hashCode());
        Object $headUrl = getHeadUrl();
        result = result * 59 + (($headUrl == null) ? 43 : $headUrl.hashCode());
        Object $realName = getRealName();
        result = result * 59 + (($realName == null) ? 43 : $realName.hashCode());
        Object $phone = getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        Object $idcard = getIdcard();
        result = result * 59 + (($idcard == null) ? 43 : $idcard.hashCode());
        Object $nickname = getNickname();
        result = result * 59 + (($nickname == null) ? 43 : $nickname.hashCode());
        Object $status = getStatus();
        return result * 59 + (($status == null) ? 43 : $status.hashCode());
    }

    public String getOpenId() {
        return this.openId;
    }

    public String getHeadUrl() {
        return this.headUrl;
    }

    public String getRealName() {
        return this.realName;
    }

    public Boolean getB2b() {
        return this.b2b;
    }

    public Boolean getIsReadNotice() {
        return this.isReadNotice;
    }

    public String getPhone() {
        return this.phone;
    }

    public Boolean getIsRealNameAuth() {
        return this.isRealNameAuth;
    }

    public String getIdcard() {
        return this.idcard;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getCustType() {
        return this.custType;
    }

    public Boolean getPhoneIsBind() {
        return this.phoneIsBind;
    }

    public Boolean getIsModifyAuth() {
        return this.isModifyAuth;
    }

    public String getStatus() {
        return this.status;
    }
}
