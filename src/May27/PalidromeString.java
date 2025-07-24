package May27;

import java.util.Scanner;

public class PalidromeString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your word : ");
        String palidrome=scanner.next();
        char[] palidromeArray=palidrome.toCharArray();
        char temp;

        for (int i = 0; i < palidromeArray.length/2; i++) {
           temp=palidromeArray[i];
           palidromeArray[i]=palidromeArray[palidromeArray.length-(i+1)];
           palidromeArray[palidromeArray.length-(i+1)]=temp;
        }
        String p=new String(palidromeArray);

        if(palidrome.equals(p)){
            System.out.println("Its a palidrome");
        }
        else{
            System.out.println("Its not a palidrome");
        }









    }







}
