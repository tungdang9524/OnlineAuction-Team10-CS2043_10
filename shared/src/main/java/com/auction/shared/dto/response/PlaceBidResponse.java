package com.auction.shared.dto.response;

public class PlaceBidResponse {
    private String auctionId;
    private double currentHighestPrice;
    private String currentLeaderId;
    private String status;

    public PlaceBidResponse() {
    }

    public PlaceBidResponse(String auctionId, double currentHighestPrice,
                            String currentLeaderId, String status) {
        this.auctionId = auctionId;
        this.currentHighestPrice = currentHighestPrice;
        this.currentLeaderId = currentLeaderId;
        this.status = status;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public double getCurrentHighestPrice() {
        return currentHighestPrice;
    }

    public void setCurrentHighestPrice(double currentHighestPrice) {
        this.currentHighestPrice = currentHighestPrice;
    }

    public String getCurrentLeaderId() {
        return currentLeaderId;
    }

    public void setCurrentLeaderId(String currentLeaderId) {
        this.currentLeaderId = currentLeaderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}