package Practice.IfElse;

import java.util.Scanner;

public class Height {
    //Height categorization: Classifying a person's height based on their height measurement.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        double Height=scanner.nextDouble();

        if(Height>=5.5 ){
            System.out.println("Your height is good enough");
        }
        else if(Height<=5.5 && Height>=3.4){
            System.out.println("Your height is short");
        }
        else{
            System.out.println("kid");
        }
    }
}
