package big2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ConcreteMediator implements Mediator{
    private List<Product> products;
    private List<User>users;

    private List<Product> cart;

    public ConcreteMediator() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.cart=new ArrayList<>();
    }
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

        try {
            File myObj = new File("product.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().split(",");

                Product product = new Product(this);
                product.setName(data[0]);
                product.setDescription(data[1]);
                product.setPrice(Double.parseDouble(data[2]));
                product.setInventory(Integer.parseInt(data[3]));

                this.products.add(product);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return this.products;
    }



    public List<User> getUserList(){
        return users;
    }

    public List<Product> getCart(){
        return cart;
    }

}