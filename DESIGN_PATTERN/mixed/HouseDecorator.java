package mixed;

public class HouseDecorator extends House {
  House house;
  HouseDecorator(House house)
  {
      this.house=house;
  }


    @Override
    public void create() {
        house.create();
    }
}
