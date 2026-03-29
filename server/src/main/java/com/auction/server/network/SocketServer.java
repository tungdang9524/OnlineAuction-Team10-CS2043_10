package com.auction.server.network;

public class SocketServer {
    private final int port;

    public SocketServer(int port) {
        this.port = port;
    }

    public void start() {
        System.out.println("Socket server is starting on port " + port);
        // TODO: implement ServerSocket, accept client connections
    }
}