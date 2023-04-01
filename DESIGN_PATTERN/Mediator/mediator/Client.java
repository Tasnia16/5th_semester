package mediator;

public class Client {
    public  static void main(String[] args) {

        ChatMediator chatMediator = new ConcreteChatMediator();
        User user1 = new ConcreteUser(chatMediator, "Esha");
        User user2 = new ConcreteUser(chatMediator, "Tasnia");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);

        user1.send("hiiiiiiiiiii");

    }
}
