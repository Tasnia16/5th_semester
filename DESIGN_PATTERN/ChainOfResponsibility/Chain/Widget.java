package Chain;

public abstract class Widget extends HelpHandler {
    private Widget parent;

    public Widget(Widget parent, int topic) {
        super(null, topic);
        this.parent = parent;
    }
}
