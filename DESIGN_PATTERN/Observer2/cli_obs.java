package Observer2;

public class cli_obs {
    public static void main(String[] args)
    {
       ConcreteSub sub1=new ConcreteSub("file1.txt");
       ConcreteObs obs1=new ConcreteObs(sub1,"observer1");
       obs1.display();

       sub1.update("file2.txt");
       obs1.display();

    }
}
