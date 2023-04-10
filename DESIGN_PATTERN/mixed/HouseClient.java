package mixed;

public class HouseClient {

    public static void main(String[] args)
    {
        HouseBuilder basicHouse = new BasicHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(basicHouse);

        engineer.constructHouse();

        BasicHouse house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);

        HouseDecorator colorDecorator=new ColorDecorator(house);
        HouseDecorator wallDecorator=new WallDecorator(house);

        CompositeDecorator compositeDecorator=new CompositeDecorator();
        compositeDecorator.add_DECORATOR(colorDecorator);
        compositeDecorator.add_DECORATOR(wallDecorator);

        compositeDecorator.create_all_decorator();




    }
}
