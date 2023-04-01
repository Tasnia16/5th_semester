package mediator;

public interface ChatMediator {

    public void send_msg(String msg, User user);
    public  void  addUser(User user);
}
