package Practice.IfElse;

import java.util.Scanner;

public class Age {
    //Age-based access: Determining if a person is old enough to vote based on their age.

    public static void main(String[] args) {
        int age=18;
        int newAge=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int userAge=scanner.nextInt();

        if(userAge>=age){
            System.out.println("You are eligible to vote. please proceed....");
        }
        else{
            newAge=age-userAge;
            System.out.println("Sorry you are not eligible to vote. \n"+newAge+" waiting years");
        }

    }
}
