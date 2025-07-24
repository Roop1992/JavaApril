package June7.PolyFramware;

import java.util.Scanner;

public class FirmwareMain {

    public static void main(String[] args) {

        Firmware firmware=null;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter \n1.Honda\n2.Audi\n3.Bronco");
        int choice= scanner.nextInt();

        switch(choice){
            case 1:{
                firmware=new Honda();
                break;
            }
            case 2:{
                firmware=new Audi();
                break;
            }
            case 3:{
               firmware=new Bronco();
                break;
            }
        }
            firmware.ABS();
        }
    }

