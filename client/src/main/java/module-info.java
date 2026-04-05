module com.auction.client {
    // Yêu cầu các thư viện cốt lõi của JavaFX
    requires javafx.controls;
    requires javafx.fxml;

    // Cho phép JavaFX truy cập vào package chứa giao diện và controller của bạn
    opens com.auction.client to javafx.fxml;
    opens com.auction.client.controller to javafx.fxml;

    // Xuất package chính ra để máy ảo Java có thể khởi chạy
    exports com.auction.client;
}