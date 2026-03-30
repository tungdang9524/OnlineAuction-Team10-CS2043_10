package com.auction.server.model;
import java.time.LocalDateTime;
public class Item {
    private String id;
    private Seller seller;
    private String name;
    private String description;
    private double startingPrice;
    private LocalDateTime createdAt;
    public Item(String id, Seller seller, String name, String description,
                double startingPrice, LocalDateTime createdAt) {
        this.id = id;
        this.seller = seller;
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.createdAt = createdAt;
    }
    public String getId() {
        return id;
    }

    public Seller getSeller() {
        return seller;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }
}
