package Observer2;
import  java.util.*;

public abstract class Sub {

    private  ArrayList<Obs>obs=new ArrayList<Obs>();

    public  void add(Obs observer){
        obs.add(observer);
    }
    public  void remove(Obs observer)
    {
        obs.remove(observer);
    }

    public abstract String get_file();

    public void notify_all()
    {
        for(Obs o:obs)
        {
            o.display();
        }
    }


}
