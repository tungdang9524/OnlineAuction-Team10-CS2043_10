package model;

import java.time.LocalDateTime;

public class Bidder extends User {
    public Bidder(String id, String username, String passwordHash, String fullName, String email,LocalDateTime createdAt, UserStatus userStatus) {
        super(id, username, passwordHash, fullName, email, Role.BIDDER, createdAt, UserStatus.ACTIVE);
    }
}
