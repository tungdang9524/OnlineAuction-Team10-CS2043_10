package com.auction.shared.message;

public class BaseRequest<T> {
    private MessageType type;
    private String requestId;
    private long timestamp;
    private T payload;

    public BaseRequest() {
    }

    public BaseRequest(MessageType type, String requestId, long timestamp, T payload) {
        this.type = type;
        this.requestId = requestId;
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