package f_m;

public class Desktop_creator extends Computer_factory{

    @Override
    public Computer get_pc() {
        return new Desktop();
    }
}
