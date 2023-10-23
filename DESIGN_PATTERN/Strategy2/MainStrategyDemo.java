package Strategy2;

public class MainStrategyDemo {
    public static void main(String args[])
    {
         Context context=new Context(new CardPayment());
         context.executeStrategy(9000);
         
        // System.out.println();
    }
}
