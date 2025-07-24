package May24;

import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        int temp=0;

        for(int i =0;i<arr.length/2;i++){
            temp=arr[i];    //10
            arr[i]=arr[arr.length-(i+1)]; //50
            arr[arr.length-(i+1)]=temp;
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int a=scanner.nextInt();

        int[] arr=new int[a];
        System.out.println("Enter your element : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
      reverseArray(arr);
    }
}
