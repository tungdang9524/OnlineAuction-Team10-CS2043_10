package model;

import java.time.LocalDateTime;

public class Seller extends User {
    public Seller(String id, String username, String passwordHash, String fullName, String email, Role role, LocalDateTime createdAt, UserStatus userStatus) {
        super(id, username, passwordHash, fullName, email, Role.SELLER, createdAt, UserStatus.ACTIVE);
    }
}
