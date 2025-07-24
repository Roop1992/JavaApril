package May20.BankAccount;

public class BankMain {
    public static void main(String[] args) {

        BankAccount bankAccount1=new BankAccount("rupinder","87687",1000);
        bankAccount1.deposit(100);
        bankAccount1.withdraw(200);
        bankAccount1.displayAccountInfo();

        BankAccount bankAccount2=new BankAccount("rupinder","87687",10000);
        bankAccount2.deposit(100);
        bankAccount2.withdraw(200);
        bankAccount2.displayAccountInfo();


    }
}
