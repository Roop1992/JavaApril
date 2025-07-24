package May10;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        for (int i = 0; i <=10 ; i++) {
           // System.out.println(i);
            if(i==5){
                continue;

            }

            if(i==6){
                break;
            }
            System.out.println(i);
        }



        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the factorial number : ");
        int num=scanner.nextInt();
        int sum=1;

        for(int i =1;i<=num;i++){
            sum=sum*i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
