package mediatorpractice;

public class ConcreteUser extends User  {

    String name;


    ConcreteUser(Mediator mediator, String name) {
        super(mediator);
        this.name=name;
    }

    @Override
    public void send(String msg) {
        System.out.println(name+" is sending"+ msg);
        mediator.send_msg(this);
    }

    @Override
    public void receive() {
        System.out.println(name+" is receiving");
    }
}
