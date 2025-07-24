package Practice.ForLOop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        //Table of a Number
        //Ask the user to input a number and print its multiplication table up to 10.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=scanner.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(i+" * "+number+" = "+number*i);

        }
    }
}
