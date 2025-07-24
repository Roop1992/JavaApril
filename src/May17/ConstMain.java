package May17;

public class ConstMain {
    public static void main(String[] args) {
       Constcalling constcalling=new Constcalling("roop","123");

        MethodOverloading methodOverloading=new MethodOverloading();
        
        String name=methodOverloading.name("Rupinder","aulakh");
        System.out.println(name);

        String s=methodOverloading.Salary(1234,34,898);
        System.out.println(s);
    }
}
