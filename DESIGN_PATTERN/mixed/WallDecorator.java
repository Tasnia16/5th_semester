package mixed;

public class WallDecorator extends HouseDecorator{
    WallDecorator(House house) {
        super(house);
    }

    @Override
    public void create()
    {
        this.house.create();
        System.out.println("Wall is decorated");
    }
}
