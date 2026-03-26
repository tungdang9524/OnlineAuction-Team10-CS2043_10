import java.time.LocalDateTime;

abstract class User {
    protected String id;
    protected String username;
    protected String password;
    protected String email;
    protected String role;
    protected LocalDateTime createdAt;
    protected boolean isActive;

}