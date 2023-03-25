package Strategy;

public class Context {

    private CalculationStrategy strategy;
    Context(CalculationStrategy strategy){
        this.strategy=strategy;
    }

    public double executeStrategy( double num1, double num2)
    {
        return strategy.calculation(num1,num2);
    }


}
