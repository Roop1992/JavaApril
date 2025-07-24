package June7.Encapsul;

public class LoginMain {

    public static void main(String[] args) {

        Login login=new Login("roop","roop123");

       //
        //System.out.println(login.getPassword());
        login.setPassword("123456");

        System.out.println( login.getPassword());

        login.loginSuccessFul("roop","roop123");

    }

}