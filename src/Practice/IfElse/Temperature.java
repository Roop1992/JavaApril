package Practice.IfElse;

import java.util.Scanner;

public class Temperature {
    //Temperature-based actions: Deciding if a plant can grow based on temperature ranges.
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter today's Temperature : ");
        int temp=scanner.nextInt();

        if(temp>=10 && temp<=40){
            System.out.println("Plant can grow in this temp..");
        }
        else{
            System.out.println("Plant canNot grow in this temp..");
            if(temp<=10 ){
                System.out.println("Too Cold....");
            }
            else{
                System.out.println("Too Hot....");
            }
        }

    }
}
