package Practice.Switch;

import java.util.Scanner;

//Menu Selection: Imagine a program with a main menu.
// The user can select options like "1" for adding a new item,
// "2" for deleting an item, "3" for
// editing an item,
// and "4" for viewing all items.
// A switch statement can efficiently handle these choices.
public class MenuSelection {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("WELCOME TO MAIN MENU");
        System.out.println("1. adding a new item\n2. delete an item\n3. editing an item\n4. view all items");
        int choice=scanner.nextInt();

        switch (choice){
            case 1:{
                System.out.println("adding new item");
                break;
            }
            case 2:{
                System.out.println("deleting an item");
                break;
            }
            case 3:{
                System.out.println("editing an item");
                break;
            }
            case 4:{
                System.out.println("view all item");
                break;
            }
            default:{
                System.out.println("Wrong input.........");
            }

        }
    }
}
