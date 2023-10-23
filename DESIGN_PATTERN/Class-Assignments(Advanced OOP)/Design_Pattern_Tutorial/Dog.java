package Design_Pattern_Tutorial;

public class Dog extends Animal{
    public void digHole()
    {
        System.out.println(("Dud a hole"));
    }

    public Dog()
    {
        super();
        setSound("Bark");
    }

    public void fly()
    {

    }

    public void changeVar( int randnum)
    {
        randnum=12;
        System.out.println("Random in methiod : "+ randnum);
    }
}
