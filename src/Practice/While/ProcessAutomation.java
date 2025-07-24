package Practice.While;

import java.util.Scanner;

public class ProcessAutomation {
    //Process Automation:
    //Many automated systems rely on "while" loops.
    // For example, a robot might keep moving forward while it detects a clear path,
    // or a heating system might keep running while the temperature is below a set threshold.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the temperature : ");
        int tempThreshold=scanner.nextInt();

        while(tempThreshold>23){
            System.out.println("Heating system keep running");
            System.out.println("Enter next temp: ");
            tempThreshold=scanner.nextInt();

        }
        System.out.println("Heating system stopped");






//        boolean clearPath=true;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the path : ");
//        int obstacle=scanner.nextInt();
//
//        while(clearPath){
//            if(obstacle==5){
//                System.out.println("There is obstacle. You cannot move forward....");
//                break;
//            }
//            System.out.println("Moving forward");
//            obstacle=scanner.nextInt();
//        }
    }
}

