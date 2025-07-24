package Practice.IfElse;

import java.util.Scanner;

public class Door {
    //Opening a door: Checking if a door code is correct before granting access.
    public static void main(String[] args) {
        String code="12345";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter code : ");
        String userCode=scanner.next();

        if(userCode.equals(code)){
            System.out.println("Door is open.\nYou can proceed...");
        }
        else{
            System.out.println("Wrong code.\nTry again....");
        }







    }
}
