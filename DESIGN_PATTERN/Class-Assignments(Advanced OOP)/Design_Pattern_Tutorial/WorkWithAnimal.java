package Design_Pattern_Tutorial;

public class WorkWithAnimal {
    public static void main(String []  args)
    {
        Dog fido=new Dog();
        fido.setName("Fido");
        //fido.setName("aaa");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);

        int randnum=10;
        fido.changeVar(randnum);                       //pass by value example

        System.out.println("RANDNUM AFTER METHOD CALL :"+ randnum);


        ChangeObjectName(fido);
        System.out.println("Dog name after method call  :"+ fido.getName());


        Animal doggy=new Dog();
        Animal kitty=new Cat();

        System.out.println("Doggy says : "+ doggy.getSound());
        System.out.println("Kitty says : "+ kitty.getSound());

        Animal []animals=new Animal[4];         //object array
        animals[0]=doggy;
        animals[1]=kitty;

        ((Dog) doggy).digHole();             //IMP

        System.out.println("Doggy says : "+ animals[0].getSound());
        System.out.println("Kitty says : "+ animals[1].getSound());

    }


    public static void ChangeObjectName(Dog fido)
    {                                                      // pass by references
        fido.setName("Marcus");
    }


}
