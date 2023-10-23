package Decorator_easy;

public class Decorator_Demo {
    public static void main(String[] args)
    {
        Car car=new BasicCar();
        Car sportCar=new SportsCar(car);

        //sportCar.assemble();

        Car all=new LuxuryCar(sportCar);
        all.assemble();
    }
}
