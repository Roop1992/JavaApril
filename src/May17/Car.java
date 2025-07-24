package May17;

public class Car {

   String name;
   String brand;
   String engineType;
   String  color;
   int horsepower;

    public Car() {
      this("Honda","jetta","V engine");
    }
    public Car(String name) {
        this();
        this.name = name;
    }

    public Car(String name,String brand) {
        this.name = name;
        this.brand=brand;
    }

    public Car(String name,String brand,String engineType) {
        this.name = name;
        this.brand=brand;
        this.engineType=engineType;
    }

    public Car(String name,String brand,String engineType,String color) {
        this.name = name;
        this.brand=brand;
        this.engineType=engineType;
        this.color=color;
    }
    public Car(String name,String brand,String engineType,String color,int horsepower) {
        this.name = name;
        this.brand=brand;
        this.engineType=engineType;
        this.color=color;
        this.horsepower=horsepower;
    }


    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Brand: "+brand);
        System.out.println("Engine Type: "+engineType);
        System.out.println("Color: "+color);
        System.out.println("Horsepower: "+horsepower);
    }
}
