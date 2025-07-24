package June3.Payment;

public class Main {
    public static void main(String[] args) {

        Payment payment=new ApplePay();
        Payment payment2=new CreditCard();
        Payment payment3=new Payment();
        Payment payment4=new PayPal();

        payment.pay();
        payment2.pay();
        payment3.pay();
        payment4.pay();




    }
}
