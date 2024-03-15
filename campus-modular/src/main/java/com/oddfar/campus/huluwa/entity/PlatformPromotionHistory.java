package com.oddfar.campus.huluwa.entity;


public class PlatformPromotionHistory extends PlatformPromotion {
    public String toString() {
        return "PlatformPromotionHistory()";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PlatformPromotionHistory))
            return false;
        PlatformPromotionHistory other = (PlatformPromotionHistory)o;
        return !other.canEqual(this) ? false : (!!super.equals(o));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlatformPromotionHistory;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
