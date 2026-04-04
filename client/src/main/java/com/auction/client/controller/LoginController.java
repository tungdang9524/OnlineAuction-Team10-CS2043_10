package com.auction.client.controller;

import com.auction.client.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
// Import SocketClient của bạn
import com.auction.client.network.SocketClient;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    // Giả sử bạn có một instance của SocketClient được truyền vào đây sau
    private SocketClient socketClient;

    @FXML
    public void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            showError("Vui lòng nhập đầy đủ tài khoản và mật khẩu!");
            return;
        }
        App.setRoot("AuctionList");

        System.out.println("Đang gửi yêu cầu đăng nhập cho: " + username);
        errorLabel.setVisible(false);
        errorLabel.setManaged(false);

        // TODO: Gọi SocketClient để gửi data lên Server
        // Ví dụ: socketClient.send("LOGIN|" + username + "|" + password);
        // Sau đó lắng nghe phản hồi từ Server để chuyển màn hình
    }

    @FXML
    public void handleRegister(ActionEvent event) {
        System.out.println("Chuyển sang màn hình đăng ký...");
        // TODO: Code logic chuyển Scene sang giao diện Register
    }

    private void showError(String message) {
        errorLabel.setText(message);
        errorLabel.setVisible(true);
        errorLabel.setManaged(true);
    }
}