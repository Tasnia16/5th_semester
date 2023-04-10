package mixed;

public class ColorDecorator extends HouseDecorator{

    ColorDecorator(House house) {
        super(house);
    }

    @Override
    public void create()
    {
        this.house.create();
        System.out.println("Color is added ");
    }
}
