package Practice.While;

import java.util.Scanner;

public class GameLoops {

  //  In a game, a "while" loop might control the game's main loop,
    //  running actions like updating the game state and redrawing the screen as long as the game is not over.

    public static void main(String[] args) {

        boolean isGameOver=false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your option\n Move\nattack\nquit\n");
        String userInput=scanner.next();

        while(!isGameOver){
            if(userInput.equalsIgnoreCase("quit")){
                System.exit(0);
            }
            System.out.println("Move\nattack\nquit");
            userInput=scanner.next();
        }
    }
}
