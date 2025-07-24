package May10;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        int x=1;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number : ");
        int choice=scanner.nextInt();
        int sum=0;
        while(x<=choice){
            sum=sum+x;
            System.out.println(x);
            x++;

        }
        System.out.println("Sum of these number is "+sum);

//        while(x<10){
//            System.out.println("Hello");
//            x++;
//        }
//
//        while(x<=10){
//            System.out.println(x);
//            x++;
//
//        }
    }
}
