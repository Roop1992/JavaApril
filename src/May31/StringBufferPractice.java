package May31;

public class StringBufferPractice {
    public static void main(String[] args) {

        StringBuffer stringBuffer=new StringBuffer("Pragra");
        StringBuffer s=stringBuffer.reverse();
        System.out.println( s);

        StringBuffer sb=new StringBuffer("Pragra");
        System.out.println(sb);

        StringBuffer company=sb.append("INC");
        System.out.println(sb);
        System.out.println(company);

        String ss=new String("hello");
        System.out.println(ss.concat(" world"));
        System.out.println(ss);


/*
*    Strings -- is an array of characters .strings are immutable once created we can not change the string.
*         String can be declared in two ways
*         1. string literals  String s="pragra";
*         2. sting object  String s=new String("Pragra");
*
*        immutable example
*        String s="Roop";
*        String h=s.concat("Aulakh")
*        System.out.prinln(s); //Roop
*        System.out.prinln(h);     //Roop Aulakh
*
*       String literals are stored in SCP in heap memory and the reference will be stored in stack.
*       if two strings are same then they will point to same variable if we change the second variable
*       it is going to create differenct object
*       on the other hand string created with object will give new memory to every object in String
*
 *
*       StringBuffer is mutable once created the modification can happen on same object
*        its thread safe
*
*       StringBuilder is not thread safe but mutable
*
* */















    }
}
