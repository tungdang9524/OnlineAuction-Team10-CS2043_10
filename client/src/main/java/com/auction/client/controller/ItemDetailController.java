package com.auction.client.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ItemDetailController {

    // Kết nối với các thành phần bên giao diện (FXML)
    @FXML
    private Button backButton;

    @FXML
    private ImageView itemImageView;

    @FXML
    private Label itemNameLabel;

    @FXML
    private Label currentPriceLabel;

    @FXML
    private Label timeLeftLabel;

    @FXML
    private TextField bidAmountField;

    @FXML
    private Button placeBidButton;

    @FXML
    private TextArea descriptionArea;

    // Hàm này chạy ngay khi màn hình vừa được load lên
    @FXML
    public void initialize() {
        // Thiết lập sự kiện cho nút Đặt Giá
        placeBidButton.setOnAction(event -> {
            String amount = bidAmountField.getText();
            System.out.println("Đang xử lý đặt giá: " + amount);
            // Sau này bạn sẽ viết code gửi API lên Server ở đây
        });

        // Thiết lập sự kiện cho nút Quay Lại
        backButton.setOnAction(event -> {
            System.out.println("Quay lại màn hình danh sách!");
            // Sau này bạn sẽ viết code chuyển Scene ở đây
        });
    }
}
