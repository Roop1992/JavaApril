package Practice.While;

public class ConditionMet {

        //Looping Until a Condition is Met:
        //A common scenario is needing to repeat an action until a specific condition is met.
        // For instance, a washing machine will continue to wash clothes until the cycle is complete
        // (a specific time or amount of water used).
        public static void main(String[] args) {

        int specificTime=45;
        int initialTime=0;


        while(initialTime<specificTime){
            System.out.println("Continue washing....");
            System.out.println("Minute " + (initialTime + 1) + ": Continue washing...");
            initialTime++;
        }
            System.out.println("Washer Cycle complete");

    }
}
