package Design_Pattern_Tutorial;

public class Animal {
    private String name;
    private double height;
    private  int weight;
    private  String sound;

    public  void setName(String newName)
    {
        name=newName;
    }

    public String getName()
    {
        return name;
    }

    public void setWeight(int newWeight)
    {

        if(newWeight>0)
        weight=newWeight;

        else
            System.out.println("Weight must be greater than 0");
    }

    public int getWeight()
    {
        return weight;
    }

    public  void setSound(String newSound)
    {
        sound=newSound;
    }


    public String getSound()
    {
        return sound;
    }

    /*public void fly()
    {
        System.out.println("I'm flying");
    }*/



}
