package Practice.While;

public class Sum {
    //Sum of Even Numbers
    //Print the sum of all even numbers between 1 and 100 using a while loop.
    public static void main(String[] args) {
         int sum=0;
         int x=1;
         while(x<=100){
             if(x%2==0){
             System.out.println(x);
             sum=sum+x; }
             x++;
         }
        System.out.println(sum);
    }
}
