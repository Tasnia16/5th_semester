package Strategy2;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with CASH" +amount);
    }
}
