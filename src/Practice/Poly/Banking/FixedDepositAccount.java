package Practice.Poly.Banking;

public class FixedDepositAccount extends Bank{

    public double getInterestRate(double amount){
        amount=balance*0.3;
        return amount;
    }
}
