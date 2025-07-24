package May6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("***********************");
        System.out.println("Welcome to my calculator");
        System.out.println("***********************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice=scanner.nextInt();
        if(choice==0 || choice>5){
            System.exit(0);
        }

        System.out.println("Enter your number 1: ");
        int num1=scanner.nextInt();

        System.out.println("Enter your number 2 ");
        int num2=scanner.nextInt();

        int result=0;

        if(choice==1){
            result=num1+num2;
            System.out.println("Sum of your given number "+ result);
        }
        else if(choice==2){
            result=num1-num2;
            System.out.println("Sub of your given number "+ result);
        }
        else if(choice==3){
            result=num1*num2;
            System.out.println("Mul of your given number "+ result);
        }
        else if(choice==4){
            double result1=(double)num1/num2;
            System.out.println("Div of your given number "+ result1);
        }
        else if(choice==5){
            result=num1%num2;
            System.out.println("Mod of your given number "+ result);
        }
    }
}

