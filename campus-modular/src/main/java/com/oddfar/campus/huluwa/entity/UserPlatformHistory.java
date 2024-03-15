package com.oddfar.campus.huluwa.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oddfar.campus.huluwa.entity.UserPlatform;

@TableName("user_platform_history")
public class UserPlatformHistory extends UserPlatform {
    public String toString() {
        return "UserPlatformHistory()";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.entity.UserPlatformHistory))
            return false;
        com.oddfar.campus.huluwa.entity.UserPlatformHistory other = (com.oddfar.campus.huluwa.entity.UserPlatformHistory)o;
        return !other.canEqual(this) ? false : (!!super.equals(o));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.entity.UserPlatformHistory;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
