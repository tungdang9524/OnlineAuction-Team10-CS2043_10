package com.auction.server;

import com.auction.server.network.SocketServer;

public class ServerApp {
    public static void main(String[] args) {
        System.out.println("Server started");
        SocketServer socketServer = new SocketServer(9999);
        socketServer.start();
    }
}