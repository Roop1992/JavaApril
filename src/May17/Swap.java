package May17;

public class Swap {

    public static void main(String[] args) {
        //swap the values of x and y
        int x=10;
        int y=20;

        //First method
        int temp=x;     //temp=10
        x=y;            //x=20
        y=temp;         //y=10

        System.out.println("X : "+x);
        System.out.println("Y : "+y);

        //Second Method
        x=x+y;                //10+20=30
        y=x-y;
        x=x-y;               //30-20=10
        System.out.println("X : "+x);
        System.out.println("Y : "+y);

    }
}
