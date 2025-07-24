package May10;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the table number : ");
        int number=scanner.nextInt();

        int x=1;
        while(x<=10){
            System.out.println(number+"*"+x+"="+x*number);
            x++;
        }
    }
}
