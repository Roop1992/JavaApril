package June7.Encapsul;

public class Team {

    private String playerUsername;
    private String playerEmail;
    private String playerPassword;
    private double salary;

    public Team(String playerUsername, String playerEmail, String playerPassword, double salary) {
        this.playerUsername = playerUsername;
        this.playerEmail = playerEmail;
        this.playerPassword = playerPassword;
        this.salary = salary;
    }

    public void login(String playerUsername,String playerPassword){
        if(this.playerUsername.equals(playerUsername) && (this.playerPassword.equals(playerPassword))) {
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Check your username and password.....");
        }
    }

    public String getPlayerUsername() {
        return playerUsername;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }

}
