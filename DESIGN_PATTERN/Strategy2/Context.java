package Strategy2;

public class Context {

    PaymentStrategy paymentStrategy;
    Context(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }

    public void executeStrategy(double amount)
    {
        paymentStrategy.pay(amount);
    }
}
