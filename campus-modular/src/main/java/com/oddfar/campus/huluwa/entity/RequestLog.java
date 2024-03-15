package com.oddfar.campus.huluwa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.oddfar.campus.huluwa.enums.PlatformEnum;
import java.util.Date;

@TableName("request_log")
public class RequestLog {
    @TableId
    private Long id;

    private PlatformEnum platform;

    private String uri;

    private String content;

    private String token;

    private String response;

    private Long cost;

    private Integer status;

    private String message;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date stamp;

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlatform(PlatformEnum platform) {
        this.platform = platform;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public void setStamp(Date stamp) {
        this.stamp = stamp;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof com.oddfar.campus.huluwa.entity.RequestLog))
            return false;
        com.oddfar.campus.huluwa.entity.RequestLog other = (com.oddfar.campus.huluwa.entity.RequestLog)o;
        if (!other.canEqual(this))
            return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
            return false;
        Object this$cost = getCost(), other$cost = other.getCost();
        if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status))
            return false;
        Object this$platform = getPlatform(), other$platform = other.getPlatform();
        if ((this$platform == null) ? (other$platform != null) : !this$platform.equals(other$platform))
            return false;
        Object this$uri = getUri(), other$uri = other.getUri();
        if ((this$uri == null) ? (other$uri != null) : !this$uri.equals(other$uri))
            return false;
        Object this$content = getContent(), other$content = other.getContent();
        if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content))
            return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token))
            return false;
        Object this$response = getResponse(), other$response = other.getResponse();
        if ((this$response == null) ? (other$response != null) : !this$response.equals(other$response))
            return false;
        Object this$message = getMessage(), other$message = other.getMessage();
        if ((this$message == null) ? (other$message != null) : !this$message.equals(other$message))
            return false;
        Object this$stamp = getStamp(), other$stamp = other.getStamp();
        return !((this$stamp == null) ? (other$stamp != null) : !this$stamp.equals(other$stamp));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.oddfar.campus.huluwa.entity.RequestLog;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $cost = getCost();
        result = result * 59 + (($cost == null) ? 43 : $cost.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $platform = getPlatform();
        result = result * 59 + (($platform == null) ? 43 : $platform.hashCode());
        Object $uri = getUri();
        result = result * 59 + (($uri == null) ? 43 : $uri.hashCode());
        Object $content = getContent();
        result = result * 59 + (($content == null) ? 43 : $content.hashCode());
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $response = getResponse();
        result = result * 59 + (($response == null) ? 43 : $response.hashCode());
        Object $message = getMessage();
        result = result * 59 + (($message == null) ? 43 : $message.hashCode());
        Object $stamp = getStamp();
        return result * 59 + (($stamp == null) ? 43 : $stamp.hashCode());
    }

    public String toString() {
        return "RequestLog(id=" + getId() + ", platform=" + getPlatform() + ", uri=" + getUri() + ", content=" + getContent() + ", token=" + getToken() + ", response=" + getResponse() + ", cost=" + getCost() + ", status=" + getStatus() + ", message=" + getMessage() + ", stamp=" + getStamp() + ")";
    }

    public Long getId() {
        return this.id;
    }

    public PlatformEnum getPlatform() {
        return this.platform;
    }

    public String getUri() {
        return this.uri;
    }

    public String getContent() {
        return this.content;
    }

    public String getToken() {
        return this.token;
    }

    public String getResponse() {
        return this.response;
    }

    public Long getCost() {
        return this.cost;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getStamp() {
        return this.stamp;
    }
}
