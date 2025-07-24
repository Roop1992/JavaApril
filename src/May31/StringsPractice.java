package May31;

public class StringsPractice {
    public static void main(String[] args) {

        //Two ways to declare string
        //1. string literals the string stores in heap memory of scp
        String a="ABC";
        System.out.println(a);
        //2.  string by creating object it will store in heap memory as a object everytime we create object like
        //this it will store at different memory
        String b=new String("ABC");
        System.out.println(b);
        if(a.equals(b)){
            System.out.println("they are equal ");
        }
        if(a==b){
            System.out.println("They are equal");
        }


    }
}
