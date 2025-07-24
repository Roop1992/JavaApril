package Practice.IfElse;
//Finding the largest number: Determining the largest among a set of numbers.
public class Largest {
    public static void main(String[] args) {
        int a=430;
        int b=25;
        int c=1800;

        int largest=0;
        if(a>=b && a>=c){
            largest=a;
        }
        else if(b>=a && b>=c){
           largest=b;
        }
        else{
            largest=c;
        }

        System.out.println(largest+" is greatest");












    }









}
