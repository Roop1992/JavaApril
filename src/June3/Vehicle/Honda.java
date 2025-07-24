package June3.Vehicle;

public class Honda extends Vehicle {
    public void run(){
        System.out.println("Honda is running...");
    }

    public void accerlate(){
        System.out.println("Honda is accerlate...");
    }

    public void stop(){
        System.out.println("Honda is stoping....");
    }
    public void stop1(){
        System.out.println("this method is not in parent class....");
    }
}
