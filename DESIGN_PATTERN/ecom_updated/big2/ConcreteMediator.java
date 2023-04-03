package big2;

import java.util.ArrayList;
import java.util.List;

class ConcreteMediator implements Mediator{
    private List<Product> products=new ArrayList<>();
    private List<User>users=new ArrayList<>();

    private List<Product> cart=new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addProduct(Product product){
        products.add(product);
    }
    public void addUser(User user){
        users.add(user);
    }

    public void addToCart(Product product){
        cart.add(product);
    }
    public void emptyCart(){
        cart.clear();
    }
    public void setPaymentMethod(PaymentStrategy paymentMethod){
        this.paymentStrategy=paymentMethod;
    }

    public Double processOrder(){
        Double price=0.0;
        for(Product product:cart){
            price+=product.getPrice();
        }
        return price;
    }
    public List<Product> getProductList(){
        return products;
    }
    public List<User> getUserList(){
        return users;
    }
    public List<Product> getCart(){
        return cart;
    }

}