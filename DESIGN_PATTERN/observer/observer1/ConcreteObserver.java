package observer1;


public class ConcreteObserver extends  Observer{

    String name;
    public ConcreteObserver(Subject subject ,String name) {
        super(subject);
        this.name=name;

    }

    @Override
    public void display() {
        System.out.println("File : "+subject.get_file_name()+ "Observer : "+name);
    }
}