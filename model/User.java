import java.time.LocalDateTime;

abstract class User {
    protected String id;
    protected String username;
    protected String password;
    protected String email;
    protected String role;
    protected LocalDateTime createdAt;
    protected boolean isActive;
    protected double balance;

    public User(String id, String username, String password, String email, String role, LocalDateTime createdAt, boolean isActive, double balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
        this.isActive = isActive;
        this.balance = balance;
    }

    public String getUsername() {
        return this.username;
    }

}