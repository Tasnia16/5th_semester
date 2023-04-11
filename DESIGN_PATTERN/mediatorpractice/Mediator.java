package mediatorpractice;
import java.util.*;

public class Mediator {

    public ArrayList<User>users;
    public String name;

    public  Mediator()
    {
        this.users=new ArrayList<>();
    }

    public void send_msg(User user)
    {
        for(User u:users)
        {
            if(u!=user)
            {
                u.receive();
            }
        }
    }

    public void add_users(User user)
    {
        users.add(user);
    }

}
