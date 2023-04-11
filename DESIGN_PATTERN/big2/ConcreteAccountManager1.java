package big2;

public class ConcreteAccountManager1 extends AbstractAccountManager1 {
    public ConcreteAccountManager1(User user) {
        super(user);
    }

    @Override
    protected void displayName() {
        System.out.println(user.getName());
    }

    @Override
    protected void displayEmail() {
        System.out.println(user.getEmail());
    }

    @Override
    protected void displayAddress() {
        System.out.println(user.getAddress());
    }


    @Override
    protected void displayEditButton() {
        System.out.println("Edit Account");
    }
}
