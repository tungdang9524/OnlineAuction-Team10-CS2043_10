package com.auction.client.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class LiveBiddingController {
    @FXML private ListView<String> bidHistoryList;
    @FXML private TextField liveBidField;
    @FXML private Button btnLiveBid;

    @FXML
    public void initialize() {
        // Code giả lập lịch sử đấu giá hiển thị cho đẹp
        bidHistoryList.getItems().addAll(
                "User_001: 20,000,000 VNĐ",
                "User_XYZ: 22,000,000 VNĐ",
                "User_Vip88: 25,500,000 VNĐ (Đang dẫn đầu)"
        );

        btnLiveBid.setOnAction(e -> {
            System.out.println("Đã đặt giá trực tiếp: " + liveBidField.getText());
        });
    }
}
