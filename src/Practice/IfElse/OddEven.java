package Practice.IfElse;

import java.util.Scanner;

public class OddEven {
    //Even/odd number check: Determining if a number is even or odd.
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number. Lets check if its odd or even:");
        int number=scanner.nextInt();

        if(number%2==0){
            System.out.println("Its Even Number");
        }
        else{
            System.out.println("Its Odd Number");
        }

    }















}
