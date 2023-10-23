package Parent_Practice;

public class Teacher extends Person{

    String sub;
    Teacher (String name,int age, String sub)
    {

        super(name, age);
        this.sub=sub;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println(sub);
    }
}
