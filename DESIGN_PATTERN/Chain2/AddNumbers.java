package Chain2;

public class AddNumbers implements Chain{

    private Chain nextChain;
    @Override
    public Chain setNextChain(Chain nextChain) {
        this.nextChain=nextChain;
        return nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "add")
        {
            System.out.println(request.getNum1()+" + "+ request.getNum2()
            +"="+ (request.getNum1()+ request.getNum2()));
        }

        else
        {
           nextChain.calculate(request);
        }

    }
}
