package com.auction.client;

import com.auction.client.network.SocketClient;

public class App {
    public static void main(String[] args) {
        System.out.println("Client started");
        SocketClient socketClient = new SocketClient("localhost", 9999);
        socketClient.connect();
    }
}