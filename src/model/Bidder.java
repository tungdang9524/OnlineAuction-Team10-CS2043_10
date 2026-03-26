package model;

import java.time.LocalDateTime;

public class Bidder extends User {
    public Bidder(String id, String username, String passwordHash, String fullName, String email, Role role, LocalDateTime createdAt, UserStatus userStatus) {
        super(id, username, passwordHash, fullName, email, User.Role.BIDDER, createdAt, User.UserStatus.ACTIVE);
    }
}
