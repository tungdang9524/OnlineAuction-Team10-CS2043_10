package com.auction.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Stage window; // Lưu trữ Stage chính của ứng dụng

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Online Auction System - Team 10");

        // Mở màn hình Login đầu tiên
        setRoot("Login");
        window.show();
    }

    // Hàm tiện ích để gọi từ các Controller khi muốn chuyển màn hình
    public static void setRoot(String fxml) {
        try {
            // Lưu ý đường dẫn: trỏ vào thư mục resources/com.auction.client.fxml/
            FXMLLoader loader = new FXMLLoader(App.class.getResource("/com/auction/client/fxml/" + fxml + ".fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 1000, 700); // Kích thước mặc định của cửa sổ
            window.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Không tìm thấy file " + fxml + ".fxml");
        }
    }

    public static void main(String[] args) {
        launch(args); // Khởi chạy JavaFX Application
    }
}