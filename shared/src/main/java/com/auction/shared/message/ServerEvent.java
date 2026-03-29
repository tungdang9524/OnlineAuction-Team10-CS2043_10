package com.auction.shared.message;

public class ServerEvent<T> {
    private MessageType type;
    private long timestamp;
    private T payload;

    public ServerEvent() {
    }

    public ServerEvent(MessageType type, long timestamp, T payload) {
        this.type = type;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
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