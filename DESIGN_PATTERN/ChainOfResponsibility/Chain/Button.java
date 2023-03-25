package Chain;

public class Button extends Widget {
    public Button(Widget parent, int topic) {
        super(parent, topic);
    }

    @Override
    public void HandleHelp() {
        if (HasHelp()) {
            System.out.println("Event is handled by button");
        } else {
            super.HandleHelp();
        }
    }
}