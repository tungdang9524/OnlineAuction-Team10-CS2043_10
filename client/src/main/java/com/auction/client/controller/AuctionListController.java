package com.auction.client.controller;

import com.auction.client.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AuctionListController implements Initializable {

    @FXML
    private FlowPane itemContainer;

    @FXML
    private Label welcomeLabel;

    // Hàm này tự động chạy ngay khi màn hình AuctionList được load lên
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Giả lập việc load dữ liệu từ Server về
        loadDummyItems();
    }

    private void loadDummyItems() {
        try {
            // Giả sử có 10 sản phẩm đang đấu giá
            for (int i = 0; i < 10; i++) {
                // Đọc file giao diện Thẻ sản phẩm
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/auction/client/fxml/ItemCard.fxml"));
                Node card = loader.load();

                // (Tùy chọn) Lấy Controller của thẻ đó để gán tên, giá tiền tương ứng
                // ItemCardController controller = loader.getController();
                // controller.setProductInfo("Sản phẩm " + i, 100 * i);

                // Thêm thẻ vào giao diện chính
                itemContainer.getChildren().add(card);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleLogout(ActionEvent event) {
        // Quay lại trang đăng nhập
        App.setRoot("Login");
    }
}