package mixed;

import java.util.ArrayList;

public class CompositeDecorator {
    ArrayList<HouseDecorator>houseDecorators;

    CompositeDecorator()
    {
        this.houseDecorators=new ArrayList<>();
    }

    public void add_DECORATOR(HouseDecorator houseDecorator)
    {
        this.houseDecorators.add(houseDecorator);
    }

    public void create_all_decorator()
    {
        for (HouseDecorator h:houseDecorators)
        {
            h.create();
        }
    }

}
