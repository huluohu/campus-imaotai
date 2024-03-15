package com.oddfar.campus.huluwa.domain;

public class BaseResult {
    private boolean success;

    private String message;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.BaseResult))
            return false;
        com.oddfar.campus.huluwa.domain.BaseResult other = (com.oddfar.campus.huluwa.domain.BaseResult)o;
        if (!other.canEqual(this))
            return false;
        if (isSuccess() != other.isSuccess())
            return false;
        Object this$message = getMessage(), other$message = other.getMessage();
        return !((this$message == null) ? (other$message != null) : !this$message.equals(other$message));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.BaseResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (isSuccess() ? 79 : 97);
        Object $message = getMessage();
        return result * 59 + (($message == null) ? 43 : $message.hashCode());
    }

    public String toString() {
        return "BaseResult(success=" + isSuccess() + ", message=" + getMessage() + ")";
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }
}
