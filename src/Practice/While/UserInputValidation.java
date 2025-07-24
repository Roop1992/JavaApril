package Practice.While;

import java.util.Scanner;

//User Input Validation:
//A program might repeatedly ask for a password until the correct password is provided,
// or ask for a valid email format until it's entered correctly. CodeHS explains this concept.
public class UserInputValidation {
    public static void main(String[] args) {

        int password=1234;
        String email="roopaulakh22@gmail.com";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the userName : ");
        String userEmail=scanner.next();
        System.out.println("Enter the password : ");
        int userInput=scanner.nextInt();


        while(!(password==userInput) || !(email.equals(userEmail))){

            if(password!=userInput){
                System.out.println("Wrong password.Try again...");
                System.out.println("Enter the password : ");
                userInput=scanner.nextInt();
            }
            else {
                System.out.println("Wrong UserName.Try again...");
                System.out.println("Enter the userName : ");
                userEmail = scanner.next();
            }
        }

        System.out.println("Access Granter");
        scanner.close();

    }
}
