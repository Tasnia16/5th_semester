package Chain;

public class HelpHandler {
    private int topic;
    private HelpHandler successor;


    public HelpHandler(HelpHandler successor, int topic) {
        this.successor = successor;
        this.topic = topic;
    }

    public void setHandler(HelpHandler successor, int topic) {
        this.successor = successor;
        this.topic = topic;
    }

    public boolean HasHelp() {
        return topic != -1;
    }

    public void HandleHelp() {
        if (successor != null) {
            successor.HandleHelp();
        }
    }
}