package com.oddfar.campus.huluwa.domain;

public class HuluwaResponse {
    private String traceId;

    private Long serverTimeStamp;

    private String code;

    private boolean success;

    private String data;

    private String message;

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public void setServerTimeStamp(Long serverTimeStamp) {
        this.serverTimeStamp = serverTimeStamp;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.domain.HuluwaResponse))
            return false;
        com.oddfar.campus.huluwa.domain.HuluwaResponse other = (com.oddfar.campus.huluwa.domain.HuluwaResponse)o;
        if (!other.canEqual(this))
            return false;
        if (isSuccess() != other.isSuccess())
            return false;
        Object this$serverTimeStamp = getServerTimeStamp(), other$serverTimeStamp = other.getServerTimeStamp();
        if ((this$serverTimeStamp == null) ? (other$serverTimeStamp != null) : !this$serverTimeStamp.equals(other$serverTimeStamp))
            return false;
        Object this$traceId = getTraceId(), other$traceId = other.getTraceId();
        if ((this$traceId == null) ? (other$traceId != null) : !this$traceId.equals(other$traceId))
            return false;
        Object this$code = getCode(), other$code = other.getCode();
        if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code))
            return false;
        Object this$data = getData(), other$data = other.getData();
        if ((this$data == null) ? (other$data != null) : !this$data.equals(other$data))
            return false;
        Object this$message = getMessage(), other$message = other.getMessage();
        return !((this$message == null) ? (other$message != null) : !this$message.equals(other$message));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.domain.HuluwaResponse;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (isSuccess() ? 79 : 97);
        Object $serverTimeStamp = getServerTimeStamp();
        result = result * 59 + (($serverTimeStamp == null) ? 43 : $serverTimeStamp.hashCode());
        Object $traceId = getTraceId();
        result = result * 59 + (($traceId == null) ? 43 : $traceId.hashCode());
        Object $code = getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        Object $data = getData();
        result = result * 59 + (($data == null) ? 43 : $data.hashCode());
        Object $message = getMessage();
        return result * 59 + (($message == null) ? 43 : $message.hashCode());
    }

    public String toString() {
        return "HuluwaResponse(traceId=" + getTraceId() + ", serverTimeStamp=" + getServerTimeStamp() + ", code=" + getCode() + ", success=" + isSuccess() + ", data=" + getData() + ", message=" + getMessage() + ")";
    }

    public String getTraceId() {
        return this.traceId;
    }

    public Long getServerTimeStamp() {
        return this.serverTimeStamp;
    }

    public String getCode() {
        return this.code;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }
}
