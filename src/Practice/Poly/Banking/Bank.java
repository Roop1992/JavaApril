package Practice.Poly.Banking;
//Banking System:
//A base class BankAccount could have a method getInterestRate().
// Subclasses like SavingsAccount, CheckingAccount, and FixedDepositAccount could override this method to return
// different interest rates.
public class Bank {

    double balance=100;

    public double getInterestRate(){
          return balance;
    }

}