package June7.Encapsul;

public class TeamMain {
    public static void main(String[] args) {
         Team team =new Team("roop","roop@gmail.com","user123",12000);


        System.out.println(team.getPlayerEmail());
        team.setPlayerPassword("roop123");
        team.login("roop","user123");






    }
}
