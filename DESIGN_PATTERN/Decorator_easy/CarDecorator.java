package Decorator_easy;

public class CarDecorator extends Car{

    Car car;
    CarDecorator(Car car)
    {
        this.car=car;
    }

    @Override
    public void assemble() {
        car.assemble();

    }
}
