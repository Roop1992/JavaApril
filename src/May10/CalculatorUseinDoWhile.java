package May10;

import java.util.Scanner;

public class CalculatorUseinDoWhile {

    public static void main(String[] args) {
        boolean calculator=true;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number 1: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter your number 2 ");
            int num2 = scanner.nextInt();

            System.out.println("***********************");
            System.out.println("Welcome to my calculator");
            System.out.println("***********************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");
            int choice=scanner.nextInt();
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
                case 0:{
                    System.out.println("Exiting the calculator");
                    calculator=false;
                    break;
                }
                default: {
                    System.out.println("Invalid Output");
                    System.exit(0);
                }
            }

        }while(calculator);
    }
}
