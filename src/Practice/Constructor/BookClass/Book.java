package Practice.Constructor.BookClass;
/*The Book Class:
Scenario: Representing books in a library or bookstore application.
Instance Variables: title, author, ISBN, publicationYear
Constructors:
Default Constructor: Book(): Initializes to default values (e.g., "Unknown" for title and author, 0 for ISBN, and 0 for publication year).
Parameterized Constructor: Book(String title, String author, String ISBN, int publicationYear): Takes all book details as arguments.
Constructor with fewer parameters: Book(String title, String author): Initializes title and author, setting ISBN and publicationYear to defaults.*/
public class Book {

    String title;
    String author;
    int ISBN;
    int publicationYear;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.ISBN = 0;
        this.publicationYear = 0;
    }

    public Book(String title, String author, int ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
