package June7.Encapsul;

public class Login {
     private String username;
     private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void loginSuccessFul(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Please check your username and password");
        }
    }









}
