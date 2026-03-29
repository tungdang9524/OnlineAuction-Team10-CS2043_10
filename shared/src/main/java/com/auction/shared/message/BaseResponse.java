package com.auction.shared.message;

public class BaseResponse<T> {
    private MessageType type;
    private String requestId;
    private boolean success;
    private String message;
    private long timestamp;
    private T payload;

    public BaseResponse() {
    }

    public BaseResponse(MessageType type, String requestId, boolean success,
                        String message, long timestamp, T payload) {
        this.type = type;
        this.requestId = requestId;
        this.success = success;
        this.message = message;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}