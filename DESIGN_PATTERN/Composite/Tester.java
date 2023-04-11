package Composite;

public class Tester implements Employee {
    String name;
    String post;
    int id;

    Tester(String name, String post, int id)
    {
        this.name=name;
        this.post=post;
        this.id=id;
    }


    @Override
    public void show_employee_detail() {
        System.out.println("Tester Details :"+name+" "+post+" "+id);
    }
}
