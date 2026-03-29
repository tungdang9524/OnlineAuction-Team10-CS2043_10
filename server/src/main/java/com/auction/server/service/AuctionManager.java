package com.auction.server.service;

import com.auction.server.model.Auction;
import com.auction.server.model.BidTransaction;
import com.auction.shared.enums.AuctionStatus;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class AuctionManager {

    private static final AuctionManager INSTANCE = new AuctionManager();

    private final Map<String, Auction> auctions = new ConcurrentHashMap<>();

    private AuctionManager() {
    }

    public static AuctionManager getInstance() {
        return INSTANCE;
    }

    public void addAuction(Auction auction) {
        if (auction != null) {
            auctions.put(auction.getId(), auction);
        }
    }

    public Optional<Auction> getAuctionById(String auctionId) {
        return Optional.ofNullable(auctions.get(auctionId));
    }

    public Collection<Auction> getAllAuctions() {
        return auctions.values();
    }

    public boolean placeBid(String auctionId, BidTransaction bidTransaction) {
        Auction auction = auctions.get(auctionId);
        if (auction == null || bidTransaction == null) {
            return false;
        }
        return auction.placeBid(bidTransaction);
    }

    public boolean updateAuctionStatus(String auctionId, AuctionStatus newStatus) {
        Auction auction = auctions.get(auctionId);
        if (auction == null || newStatus == null) {
            return false;
        }
        auction.setStatus(newStatus);
        return true;
    }

    public boolean removeAuction(String auctionId) {
        return auctions.remove(auctionId) != null;
    }
}