package mediator;

public class ConcreteUser extends User {
    public ConcreteUser(ChatMediator chatMediator, String name)
    {
        super(chatMediator,name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+"sending nsg="+msg);
        chatMediator.send_msg(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+"Receiving msg="+msg);

    }

}
