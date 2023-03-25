package Strategy;

public class Main {

    public static void main(String[] args) {


        Context context = new Context((new AddOperation()));
        System.out.println(context.executeStrategy(4,9));

    }
}