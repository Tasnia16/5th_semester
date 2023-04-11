package Chain2;

public class TestChain {
    public static void main(String[] args)
    {
        Chain chainCal1=new AddNumbers();
        Chain chainCal2=new SubtractNum();
        Chain chainCal3=new MultNum();
        Chain chainCal4=new DivNumber();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        chainCal3.setNextChain(chainCal4);

        Numbers request=new Numbers(3,6,"add");

        chainCal3.calculate(request);

    }
}
