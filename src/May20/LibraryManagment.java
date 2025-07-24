package May20;

public class LibraryManagment {
    String studentName;
    String bookTitle;
    String author;
    static int totalBookIssued=0;

    public LibraryManagment(String studentName, String bookTitle, String author) {
        this.studentName = studentName;
        this.bookTitle = bookTitle;
        this.author = author;
        this.totalBookIssued++;
    }

    public void printDetails(){
        System.out.println("Book Title : "+bookTitle);
        System.out.println("Books Issued : "+totalBookIssued);
    }

    static void showTotalBooksIssued(){
        System.out.println("Books Issued : "+totalBookIssued);
    }
}
