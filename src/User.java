import java.util.Scanner;

public class User {
    private String Username;
    private String Password;

    public User(String username, String password) {
        this.Username = username;
        this.Password = password;
    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        this.Username = username;
    }
    public boolean verifyPassword(String inputPassword) {
        if (inputPassword.equals(Password)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        User user1 = new User("Takyi", "DK123");
        System.out.println(user1.verifyPassword("DK1253"));
    }
}
