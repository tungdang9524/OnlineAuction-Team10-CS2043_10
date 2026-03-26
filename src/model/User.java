package model;

import java.time.LocalDateTime;

public abstract class User {
    private String id;
    private String username;
    private String passwordHash;
    private String fullName;
    private String email;
    private Role role;
    private LocalDateTime createdAt;
    private UserStatus userStatus;

    // Fixed value for Role (using enum)
    public enum Role {
        BIDDER, SELLER, ADMIN
    }

    // Fixed value for userStatus (using enum)
    public enum UserStatus {
        ACTIVE, INACTIVE, BANNED
    }

    public User(String id, String username, String passwordHash, String fullName, String email, Role role, LocalDateTime createdAt, UserStatus userStatus) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
        this.userStatus = userStatus;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UserStatus getUserStatus() {
        return this.userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public void login() {
        System.out.println(this.username + " logged in.");
    }

    public void logout() {
        System.out.println(this.username + " logged out.");
    }
}