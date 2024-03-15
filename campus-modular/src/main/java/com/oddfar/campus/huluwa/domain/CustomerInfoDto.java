package com.oddfar.campus.huluwa.domain;

import com.oddfar.campus.huluwa.domain.CustomerInfo;

public class CustomerInfoDto extends CustomerInfo {
    public String toString() {
        return "CustomerInfoDto()";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.CustomerInfoDto))
            return false;
        com.oddfar.campus.huluwa.domain.CustomerInfoDto other = (com.oddfar.campus.huluwa.domain.CustomerInfoDto)o;
        return !other.canEqual(this) ? false : (!!super.equals(o));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.CustomerInfoDto;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
