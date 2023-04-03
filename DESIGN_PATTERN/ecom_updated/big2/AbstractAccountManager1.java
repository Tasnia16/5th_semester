package big2;



public abstract class AbstractAccountManager1 {
    protected User user;

    public AbstractAccountManager1(User user) {
        this.user = user;
    }

    public void displayAccountInfo() {
        displayName();
        displayEmail();
        displayAddress();
        displayEditButton();
    }

    protected abstract void displayName();
    protected abstract void displayEmail();
    protected abstract void displayAddress();
    protected abstract void displayEditButton();
}
