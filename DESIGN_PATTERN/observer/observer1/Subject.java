package observer1;

import java.util.ArrayList;
public abstract class Subject {

    private ArrayList<Observer>observers=new ArrayList<Observer>();

    public abstract String get_file_name();

    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    public void detach(Observer observer)
    {
        observers.remove(observer);
    }
    public void notify_observer()
    {
        for (Observer obj: observers)
        {
            obj.display();
        }
    }
}