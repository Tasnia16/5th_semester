package big2;

import java.util.Scanner;

public interface PaymentStrategy {
    Scanner scanner=new Scanner(System.in);
    public void processPayment(Double price);
    public PaymentStrategy setPayment();
}
