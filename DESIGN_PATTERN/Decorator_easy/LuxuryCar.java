package Decorator_easy;

public class LuxuryCar extends CarDecorator{
    LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble()
    {
        this.car.assemble();
        System.out.println("Assembling Luxury Car");
    }
}
