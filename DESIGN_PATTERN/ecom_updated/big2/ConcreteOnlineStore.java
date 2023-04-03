package big2;


import Big.AbstractAccountManager;
import Big.ConcreteAccountManager;

class ConcreteOnlineStore extends OnlineStore {
    public ConcreteOnlineStore(Mediator mediator){
        super(mediator);
    }

    @Override
    public void displayProduct() {
        Integer i=1;
        for(Product product: mediator.getProductList()){
            System.out.println(i+".Displaying product: " + product.getName() + " - " + product.getDescription() + " - $" + product.getPrice());
            i++;
        }
    }

    public void Login(User user){

        if(mediator.getUserList().isEmpty()) {
            System.out.println("Creating user account " + user.getName());
            mediator.addUser(user);
        } else {
            boolean userFound = false;
            for(User checkUser : mediator.getUserList()) {
                if(user.getName().equals(checkUser.getName()) && user.getPassword().equals(checkUser.getPassword())) {
                    System.out.println("User logged in: " + user.getName());
                    userFound = true;
                    break;
                }
            }
            if(!userFound) {
                System.out.println("Creating user account " + user.getName());
                mediator.addUser(user);
            }
        }

        System.out.println("aaaa");
        AbstractAccountManager1 abstractAccountManager1=new ConcreteAccountManager1(user);
        abstractAccountManager1.displayAccountInfo();

    }

    public void addProductToCart(Integer index){
        mediator.addToCart(mediator.getProductList().get(index));
        System.out.println("Cart is: ");
        for(Product product: mediator.getCart()){
            System.out.println("Added : " + product.getName() + " - " + product.getDescription() + " - $" + product.getPrice());
        }
    }
    public void createUserAccount(User user) {
        System.out.println("Creating user account for " + user.getName() + " with email " + user.getEmail());
    }

    @Override
    public void processPayment(PaymentStrategy paymentMethod) {
        if(mediator.getCart().isEmpty()){
            System.out.println("Cart is empty!");
            return;
        }
        mediator.setPaymentMethod(paymentMethod);
        System.out.println("Product bought with price: " + mediator.processOrder());
        paymentMethod.processPayment(mediator.processOrder());
        mediator.emptyCart();
    }
}