public class Admin extends User {

    private String username;
    private String password;

    public Admin(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String input1, String input2) {
        return this.username.equals(input1) && this.password.equals(input2);
    }

    @Override
    public void displayinfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}