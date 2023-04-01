package mediator;

public abstract class User {
    protected  String name;
    protected ChatMediator chatMediator;

    public  User(ChatMediator chatMediator, String name)
    {
        this.chatMediator=chatMediator;
        this.name=name;
    }

    public abstract  void send(String msg);
    public abstract void receive(String msg);

}
