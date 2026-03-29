package com.auction.client.network;

public class SocketClient {
    private final String host;
    private final int port;

    public SocketClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect() {
        System.out.println("Connecting to server " + host + ":" + port);
        // TODO: implement Socket connection
    }
}