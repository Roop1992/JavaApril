package May17;

public class Constcalling {
    String name;
    String capacity;
    public Constcalling() {
        System.out.println("Hello World");
    }
    public Constcalling(String name) {
        this();
        System.out.println("Hello Pragra");
    }

    public Constcalling(String name, String capacity) {
        this("roop");
        System.out.println("Hello Students");
    }

}
