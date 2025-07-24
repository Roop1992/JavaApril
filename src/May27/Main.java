package May27;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();

        car.brand="Honda";

        Bike bike=new Bike();
        bike.brand="Suzuki";


        System.out.println(car.brand);
        System.out.println(bike.brand);
    }
}
