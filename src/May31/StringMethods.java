package May31;

public class StringMethods {
    public static void main(String[] args) {

//        String s1="Pragra push";
//        System.out.println(s1.indexOf("a"));
//        System.out.println(s1.indexOf("push"));
//        System.out.println(s1.concat(" Hello"));
//        System.out.println(s1.toUpperCase());
//
//        char[] ch=s1.toCharArray();
//        System.out.println(ch);
//        String ch1=new String(ch);
//        System.out.println(s1.equalsIgnoreCase(ch1));

        String ss = "The class String 1 includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase.";

        String[] ch = ss.split(" ");
        int words = 0;
        int space=0;
        for (int i = 0; i < ch.length; i++) {
            words = words + 1;
        }
        System.out.println("Total number of words are : " + words);

        char[] chArray = ss.toCharArray();
        int character=0;
        int num=0;
        for (int i = 0; i < chArray.length; i++) {
           if(Character.isLetter(chArray[i])){
               character=character+1;
           }
            if(Character.isDigit(chArray[i])){
                num=num+1;
            }
            if(Character.isWhitespace(chArray[i])){
                space=space+1;
            }
        }
        System.out.println("Total number of Characters are : "+character);
        System.out.println("Total number of digits are: "+num);
        System.out.println("Total number of space are: "+space);

    }



    }

