package big2;

import java.util.List;

public interface Mediator {
    public void addProduct(Product product);
    public void addToCart(Product product);
    public void emptyCart();
    public void addUser(User user);
    public Double processOrder();
    public List<Product> getProductList();
    public List<User> getUserList();
    public List<Product> getCart();

    public void setPaymentMethod(PaymentStrategy paymentMethod);
}

