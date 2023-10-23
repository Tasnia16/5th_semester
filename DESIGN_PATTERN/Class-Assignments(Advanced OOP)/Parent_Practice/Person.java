package Parent_Practice;

public class Person {
    String name;
    int age;

    Person()
    {
        System.out.println("ohooo");
    }

    Person (String name,int age)
    {
        this.name=name;
        this.age=age;
    }

  /* public void set(String name,int age)
   {
       this.name=name;
       this.age=age;
   }*/

    public void display()
    {
        System.out.println(name+" "+age+" ");
    }
}
