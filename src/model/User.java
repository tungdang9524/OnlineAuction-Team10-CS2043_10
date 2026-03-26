package model;
import java.time.LocalDateTime;

abstract class User {
    protected String id;
    protected String username;
    protected String passwordHash;
    protected String fullName;
    protected String email;
    protected String role;
    protected LocalDateTime createdAt;
    protected String status;

    public User(String id, String username, String passwordHash, String email, String role, LocalDateTime createdAt, String status) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
        this.status = status;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void login() {
        System.out.println(this.username + "logged in.");
    }

    public void logout() {
        System.out.println(this.username + "logged out.");
    }

}