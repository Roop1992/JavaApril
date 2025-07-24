package May20;

public class LibraryMain {

    public static void main(String[] args) {
        LibraryManagment book1=new LibraryManagment("roop","Ikigai","abc");
        book1.printDetails();
        LibraryManagment book2=new LibraryManagment("Fateh","Rich Dad Poor Dad","def");
        book2.printDetails();
        LibraryManagment book3=new LibraryManagment("Nirvaan","billionaire","yyut");
        book3.printDetails();
        System.out.println();
        LibraryManagment.showTotalBooksIssued();





    }
}
