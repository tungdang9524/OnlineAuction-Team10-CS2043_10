package model;

import java.time.LocalDateTime;

public class Admin extends User {
    public Admin(String id, String username, String passwordHash, String fullName, String email,LocalDateTime createdAt, UserStatus userStatus) {
        super(id, username, passwordHash, fullName, email, Role.ADMIN, createdAt, UserStatus.ACTIVE);
    }
}
