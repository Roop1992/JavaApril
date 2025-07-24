package Practice.Poly.Animal;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal=null;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter \n1.Cat \n2.Bird \n3.Dog");
        int choice=scanner.nextInt();

        switch(choice){
            case 1:{
                animal=new Cat();
                break;
            }
            case 2:{
                animal=new Bird();
                break;
            }
            case 3:{
                animal=new Dog();
                break;
            }
        };
        animal.makeSound();

    }
}
