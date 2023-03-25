package Chain;

public class Application extends HelpHandler {
    public Application(int topic) {
        super(null, topic);
    }

    @Override
    public void HandleHelp() {
        System.out.println("Event is handled by Application");
    }
}