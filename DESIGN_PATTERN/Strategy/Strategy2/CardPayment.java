package Strategy2;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with CARD"+ amount);
    }
}
