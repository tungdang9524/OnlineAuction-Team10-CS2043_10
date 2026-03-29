package com.auction.server.model;

import com.auction.shared.enums.AuctionStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Auction {
    private String id;
    private String itemId;
    private String sellerId;
    private double startPrice;
    private double currentHighestPrice;
    private String currentLeaderId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private AuctionStatus status;
    private final List<BidTransaction> bidHistory = new ArrayList<>();

    public Auction() {
    }

    public Auction(String id, String itemId, String sellerId, double startPrice,
                   LocalDateTime startTime, LocalDateTime endTime, AuctionStatus status) {
        this.id = id;
        this.itemId = itemId;
        this.sellerId = sellerId;
        this.startPrice = startPrice;
        this.currentHighestPrice = startPrice;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public synchronized boolean canAcceptBid(double amount) {
        return status == AuctionStatus.RUNNING && amount > currentHighestPrice;
    }

    public synchronized boolean placeBid(BidTransaction bid) {
        if (bid == null) {
            return false;
        }
        if (!canAcceptBid(bid.getAmount())) {
            return false;
        }

        this.currentHighestPrice = bid.getAmount();
        this.currentLeaderId = bid.getBidderId();
        this.bidHistory.add(bid);
        return true;
    }

    public synchronized List<BidTransaction> getBidHistory() {
        return Collections.unmodifiableList(bidHistory);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public AuctionStatus getStatus() {
        return status;
    }

    public void setStatus(AuctionStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", startPrice=" + startPrice +
                ", currentHighestPrice=" + currentHighestPrice +
                ", currentLeaderId='" + currentLeaderId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auction auction)) return false;
        return Objects.equals(id, auction.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}