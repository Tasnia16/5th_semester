package Strategy2;

public class bKashPayment  implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with bKash"+ amount);
    }
}
