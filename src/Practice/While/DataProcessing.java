package Practice.While;

public class DataProcessing {
    //Data Processing:
    //When dealing with data, a "while" loop can be used to process a set of records until all records
    // have been handled,
    // like processing all entries in a database table.
    public static void main(String[] args) {

        int dataBaseEntries = 0;
        while(dataBaseEntries<11){
            System.out.println("Data is handling");
            dataBaseEntries++;
        }
        System.out.println("All entries handled successfully...");

    }
}
