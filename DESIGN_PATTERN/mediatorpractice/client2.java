package mediatorpractice;

public class client2 {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();
        User user1 = new ConcreteUser(mediator, "Esha");
        User user2 = new ConcreteUser(mediator, "Tasu");
        mediator.add_users(user1);
        mediator.add_users(user2);

        user1.send("hiiiiii");
    }

}
