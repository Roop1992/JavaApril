package Practice.Poly.Banking;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank bank=null;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter \n1.FixedDepositAccount\n2.CheckingAccount\n3. SavingAccounts");
        int choice=scanner.nextInt();

        switch(choice){
            case 1:{
                bank=new FixedDepositAccount();
                break;
            }
            case 2:{
                bank=new CheckingAccount();
                break;
            }
            case 3:{
                bank=new SavingAccounts();
                break;
            }
        }

        System.out.println(bank.getInterestRate());

    }
}
