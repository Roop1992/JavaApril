package May20;

public class Bottle {

    static int water=5;  //4
    static String a="apple";

    Bottle(){

        System.out.println(a.toUpperCase());
        water--;    //5-1=4
        System.out.println(water);       //4
    }

    public static void main(String[] args) {

        new Bottle();   //4
        new Bottle();
        new Bottle();

    }

}
