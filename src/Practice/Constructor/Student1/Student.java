package Practice.Constructor.Student1;
/*The Student Class:
Scenario: You need to model students in a school management system.
Instance Variables: name, studentID, major, GPA
Constructors:
Default Constructor: Student(): Initializes all instance variables to default values (e.g., empty string for name, 0 for studentID and GPA, and a default major like "Undecided").
Parameterized Constructor: Student(String name, int studentID, String major, double GPA): Takes all student details as arguments and initializes the object accordingly.
Constructor with Limited Parameters: Student(String name): Initializes the name and sets other fields to default values.
Example Usage:
* */
public class Student {
   String name;
   int studentID;
   String major;
   double GPA;

     Student() {
       name="";
       studentID=0;
       GPA=0;
       major="Undecided";
    }

    public Student(String name, int studentID, String major, double GPA) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.GPA = GPA;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", major='" + major + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
