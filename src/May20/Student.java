package May20;

public class Student {
    String name;
    int id;
    static String section;
    static String classNumber;

    static {
        classNumber = "12";
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.section="A";

    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("id : "+id);
        System.out.println("section : "+section);
        System.out.println("classNumber : "+classNumber);
    }




}
