package Observer2;

public class ConcreteObs extends Obs {

    Sub sub;
    String name;

    ConcreteObs(Sub sub, String name)
    {
        this.sub=sub;
        this.name=name;
    }

    @Override
    public void display() {
        System.out.println(sub.get_file()+name);
    }
}
