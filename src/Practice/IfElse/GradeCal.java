package Practice.IfElse;

import java.util.Scanner;

public class GradeCal {
    //Grade calculation: Assigning a letter grade based on a numerical score.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        int marks=scanner.nextInt();

        if(marks<=90 && marks>=70){
            System.out.println("A grade");
        }
        else if(marks<=70 && marks>=60){
            System.out.println("B grade");
        }
        else if(marks<=60 && marks>=50){
            System.out.println("C grade");
        }
        else if(marks<=50 && marks>=30){
            System.out.println("D grade");
        }
        else if(marks>=90){
            System.out.println("Wrong Input");
        }
        else{
            System.out.println("You Fail");
        }

    }







}
