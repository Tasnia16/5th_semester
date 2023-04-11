package big2;

public class Platform {

    private Mediator mediator;

    public Platform(){




//        Product product1=new Product("Igloo Bar", "IceCream",30.0,1);
//        Product product2=new Product("Lays Chips","Chips",60.0,2);
//        Product product3=new Product("7up","Soft Drink",50.0,3);
//        Product product4=new Product("Chocolate","Sweet",100.0,4);

        Mediator mediator=new ConcreteMediator();
      //  List<Product> products= mediator.getProductList();




//        mediator.addProduct(product1);
//        mediator.addProduct(product2);
//        mediator.addProduct(product3);
//        mediator.addProduct(product4);
        this.mediator=mediator;
    }
    public Mediator getMediator(){
        return this.mediator;
    }
}
