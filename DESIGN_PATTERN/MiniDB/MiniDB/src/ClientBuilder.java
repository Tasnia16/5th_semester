import java.util.HashMap;

public class ClientBuilder {

    HashMap<String, Object>  commands = new HashMap<>();
    public cli buildCli(){
        
        cli client = new cli();
           commands.put("add", new add());
           commands.put("delete", new delete());
           commands.put("drop", new drop());
           commands.put("help", new help());
           commands.put("list", new list());
           commands.put("New", new New());
           commands.put("read", new read());
           commands.put("schema", new schema());
           commands.put("use", new use());
        client.setCommandList(commands);
        return client;
    }

}
