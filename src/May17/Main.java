package May17;

public class Main {
    public static void main(String[] args) {

        Car honda=new Car("honda","civic","flat engine","black",1234);
        Car mustang=new Car("mustang","must","v engine","red",7576567);
        Car audi=new Car("audi","audi","Boxer","white",76876);
        Car car2=new Car();

        car2.display();
        System.out.println("Car 1 description: ");
        honda.display();
        System.out.println();

        System.out.println("Car 2 description: ");
        mustang.display();
        System.out.println();

        System.out.println("Car 3 description: ");
        audi.display();

    }
}
