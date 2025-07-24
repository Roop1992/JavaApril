package May10;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int userInput;

        do {
            System.out.println("***********************");
            System.out.println("Welcome to my calculator");
            System.out.println("***********************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 0 || choice > 5) {
                System.exit(0);
            }

            System.out.println("Enter your number 1: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter your number 2 ");
            int num2 = scanner.nextInt();

            int result = 0;
            switch (choice) {
                case 1: {
                    result = num1 + num2;
                    System.out.println("Sum of your given number " + result);
                    break;
                }
                case 2: {
                    result = num1 - num2;
                    System.out.println("Sub of your given number " + result);
                    break;
                }
                case 3: {
                    result = num1 * num2;
                    System.out.println("Mul of your given number " + result);
                    break;
                }
                case 4: {
                    result = num1 / num2;
                    System.out.println("Div of your given number " + result);
                    break;
                }
                case 5: {
                    result = num1 % num2;
                    System.out.println("Mod of your given number " + result);
                    break;
                }
                default: {
                    System.exit(0);
                }
            }
            System.out.println("Do you want to continue press 1");
            userInput = scanner.nextInt();
        } while (userInput == 1) ;


    }

}