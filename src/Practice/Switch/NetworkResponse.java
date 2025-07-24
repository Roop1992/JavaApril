package Practice.Switch;

import java.util.Scanner;

public class NetworkResponse {
    //Network Responses: In a client-server application,
    // the server might send back different responses based on the request.
    // The client can use a switch statement to handle these responses. For example:
    //case 200: OK (request successful)
    //case 404: Not Found (resource not available)
    //case 500: Internal Server Error
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What code you are seeing on screen\ncode 200\ncode 404\ncode 500");
        int choice=scanner.nextInt();

        switch(choice){
            case 200:{
                System.out.println("OK (request successful)");
                break;
            }
            case 404:{
                System.out.println("Not Found (resource not available)");
                break;
            }
            case 500:{
                System.out.println("Internal Server Error");
                break;
            }
            default:{
                System.out.println("Enter correct Error Code....");
            }
        }

    }
}
