package Practice.Constructor.Student1;

public class StudentMain {
    public static void main(String[] args) {
        Student student =new Student();
        System.out.println(student);

        Student student1 =new Student("rupinder");
        System.out.println(student1);

        Student student2 =new Student("rupinder",12,"HR",9.6);
        System.out.println(student2);

        Student student3 =new Student("rupinder",12,"HR",9.6);
        System.out.println(student2);
    }
}
