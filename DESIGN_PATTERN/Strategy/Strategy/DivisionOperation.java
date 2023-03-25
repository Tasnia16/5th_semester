package Strategy;

public class DivisionOperation implements CalculationStrategy {

    @Override
    public double calculation(double num1, double num2) {
        return num1 / num2;
    }
}
