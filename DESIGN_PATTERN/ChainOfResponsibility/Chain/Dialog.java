package Chain;

public class Dialog extends Widget {
    public Dialog(HelpHandler successor, int topic) {
        super(null, topic);
        setHandler(successor, topic);
    }

    @Override
    public void HandleHelp() {
        if (HasHelp()) {
            System.out.println("Event is handled by Dialog");
        } else {
            super.HandleHelp();
        }
    }
}
