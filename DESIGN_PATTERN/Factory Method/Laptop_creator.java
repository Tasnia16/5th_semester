package f_m;

public class Laptop_creator extends Computer_factory{
    @Override
    public Computer get_pc() {
        return new Laptop();
    }
}
