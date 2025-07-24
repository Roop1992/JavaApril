package May13;

public class Main {
    public static void main(String[] args) {

        Animal dog=new Animal();
        dog.color="black";
        dog.weight=12;
        dog.height=2;

        dog.sleep();

       Student student=new Student("rupinder",12);
        System.out.println(student.name);

    }
}
