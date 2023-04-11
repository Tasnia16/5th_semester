package Decorator_easy;

public class SportsCar extends CarDecorator{

    SportsCar(Car car) {
        super(car);
    }

    public void assemble()
    {
        this.car.assemble();
        System.out.println("Assembling Sports Car");
    }
}
