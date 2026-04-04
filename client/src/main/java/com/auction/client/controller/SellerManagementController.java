package com.auction.client.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class SellerManagementController {
    @FXML private TableView<?> productsTable;
    @FXML private Button btnAddItem;

    @FXML
    public void initialize() {
        btnAddItem.setOnAction(e -> {
            System.out.println("Mở form thêm sản phẩm mới...");
        });
    }
}