package Composite;

public class Developer implements Employee {

    String name;
    String post;
    int id;

    Developer(String name, String post, int id)
    {
        this.name=name;
        this.post=post;
        this.id=id;
    }


    @Override
    public void show_employee_detail() {
        System.out.println("Employee Details :"+name+" "+post+" "+id);
    }
}
