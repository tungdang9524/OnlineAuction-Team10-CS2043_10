package com.auction.server.model;

import com.auction.shared.enums.Role;
import com.auction.shared.enums.UserStatus;

import java.time.LocalDateTime;

public class Seller extends User {
    public Seller(String id, String username, String passwordHash, String fullName, String email,LocalDateTime createdAt) {
        super(id, username, passwordHash, fullName, email, Role.SELLER, createdAt, UserStatus.ACTIVE);
    }
}
