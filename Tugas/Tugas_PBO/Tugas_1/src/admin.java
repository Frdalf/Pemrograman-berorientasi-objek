public class admin {
    private String username = "Admin017";
    private String password = "Password017";

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}