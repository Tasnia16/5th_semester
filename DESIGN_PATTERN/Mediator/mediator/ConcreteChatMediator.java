package mediator;
import java.util.*;

public class ConcreteChatMediator implements ChatMediator {

    private ArrayList<User>users;

    public  ConcreteChatMediator()
    {
        this.users=new ArrayList<>();
    }


    @Override
    public void send_msg(String msg, User user) {
        for (User u:users)
        {
            if(u!=user)
            {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
             this.users.add(user);
    }
}
