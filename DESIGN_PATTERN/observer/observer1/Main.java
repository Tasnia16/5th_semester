package observer1;

public class Main {
    public static void main(String[] args)
    {
        ConcreteSubject file=new ConcreteSubject("file.txt");
        ConcreteObserver Observer1= new ConcreteObserver(file, "Observer1");
        Observer1.display();
        file.Changes("file2.txt");

        Observer1.display();
    }
}