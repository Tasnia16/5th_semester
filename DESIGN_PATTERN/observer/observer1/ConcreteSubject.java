package observer1;


public class ConcreteSubject extends Subject {

    private String FileName;

    public ConcreteSubject(String FileName)
    {
        this.FileName=FileName;
    }

    public void Changes(String FileName)
    {
        this.FileName=FileName;
        notify_observer();
    }
    @Override
    public String get_file_name( ) {
        return FileName;
    }
}