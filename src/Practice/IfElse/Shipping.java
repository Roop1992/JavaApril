package Practice.IfElse;

import java.util.Scanner;

public class Shipping {
  //  Shipping costs: Calculating shipping costs based on package weight.
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your package weight : ");
        int weight=scanner.nextInt();
        int shippingCost=0;

        if(weight>=50){
            shippingCost=weight*40;
            System.out.println("Total cost will be "+shippingCost);
        }
        else{
            shippingCost=weight*20;
            System.out.println("Total cost will be "+shippingCost);
        }










    }
}
