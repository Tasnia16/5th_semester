package mixed;

public class BasicHouseBuilder implements HouseBuilder{

    private BasicHouse house;

    BasicHouseBuilder()
    {
        this.house=new BasicHouse();
    }

    @Override
    public void buildBasement() {
         house.setBasement("basement");
    }



    @Override
    public void buildRoof() {
       house.setRoof("Roof");
    }

    @Override
    public void buildInterior() {
       house.setInterior("Interior");
    }

    @Override
    public BasicHouse getHouse() {
        return  this.house;
    }


}
