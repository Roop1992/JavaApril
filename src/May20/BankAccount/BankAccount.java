package May20.BankAccount;

public class BankAccount {

    String accountHolderName;
    String accountNumber ;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public double deposit(double amount){
        balance=balance+amount;
        return balance;
    }
    public double withdraw(double amount){
        balance =balance-amount;
        return balance;
    }
    public void displayAccountInfo(){
        System.out.println("Account holder : "+accountHolderName);
        System.out.println("Account number : "+accountNumber);
        System.out.println("Current balance is : "+balance);
    }
}
