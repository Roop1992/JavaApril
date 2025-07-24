package Practice.While;

import java.util.Random;

public class NetworkRequest {
    public static void main(String[] args) {
        //Network Requests:
        //A program might repeatedly try to connect to a server until a connection is established.
        //Essentially, anytime you have a task that needs to be repeated until a certain outcome occurs,
        // a "while" loop is a suitable programming construct.

        Random rand=new Random();
        int randomNumber=rand.nextInt(50);
        int network=0;
        System.out.println(randomNumber);

        while(randomNumber!=33){
            System.out.println("Not connecting.. searching for server");
            randomNumber=rand.nextInt(50);
        }
        System.out.println("Found the server...connected");
    }
}
