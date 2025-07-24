package May6;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {
        System.out.println("*******************************");
        System.out.println("Welcome to Rogers");
        System.out.println("*******************************");
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. English\n2.French");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:{
                System.out.println("1. Tech Support\n2. Billing\n3. Payment Arrangment\n4. Sales");
                int englishChoice=scanner.nextInt();
                switch(englishChoice){
                    case 1:{
                        System.out.println("Connecting to tech support");
                        break;
                    }
                    case 2:{
                        System.out.println("Connecting to Billing");
                        break;
                    }
                    case 3:{
                        System.out.println("Connecting to Payment Arrangement");
                        break;
                    }
                    case 4:{
                        System.out.println("Connecting to Sales");
                        break;
                    }
                }
            break;
            }
            case 2:{
                System.out.println("1. support technique\n2. Facturation\n3. Modalités de paiement\n4. Ventes");
                int frenchChoice=scanner.nextInt();
                switch(frenchChoice){
                    case 1:{
                        System.out.println("Connexion au support technique");
                        break;
                    }
                    case 2:{
                        System.out.println("Connexion à la facturation");
                        break;
                    }
                    case 3:{
                        System.out.println("Connexion aux modalités de paiement");
                        break;
                    }
                    case 4:{
                        System.out.println("Connexion aux ventes");
                        break;
                    }
                }
            }
            default:{
                System.exit(0);
            }
        }

    }
}
