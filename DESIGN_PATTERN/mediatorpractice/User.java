package mediatorpractice;

public abstract class User {

    Mediator mediator;
    User(Mediator mediator)
    {
        this.mediator=mediator;
    }

    public abstract void send(String msg);
    public abstract void receive();


}
