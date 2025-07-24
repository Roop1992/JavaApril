package Practice.ForLOop;

public class ForLoop {
    //Factorial Calculator
    //Write a program to calculate the factorial of a number using a for loop.

    public static void main(String[] args) {
        int num=5;
        int sum=1;

        for (int i = 1; i <=num ; i++) {
            sum=sum*i;
        }
        System.out.println(sum);

    }
}
