package May3;
/* Type casting is converting pne data type to others.There is two type of typecasting:
1. widening typecasting converting smaller data type to larger data type to avoid data loss
eg. int to double  suppose we have 10 and after converting it become 10.0
*2. narrowing typecasting converting larger data type to smaller data type it will lose data
*eg. double to int suppose we have 10.75 it will give you 10 after converting and the .75 will loss
*
* */
public class Sum {
    public static void main(String[] args) {
        int a=10;
        double b=20;

        int result=a+(int)b;
        System.out.println(result);

        int result2=a-(int)b;
        System.out.println(result2);

        int result3=a*(int)b;
        System.out.println(result3);


        int result4=a/(int)b;
        System.out.println(result4);

        int result5=a%(int)b;
        System.out.println(result5);
    }
}
