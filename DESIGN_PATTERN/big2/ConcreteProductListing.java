package big2;


public class ConcreteProductListing extends AbstractProductListing {
    public ConcreteProductListing(Product product) {
        super(product);
    }

    @Override
    protected void displayName() {
        System.out.println("Product Name : "+product.getName());
    }


    @Override
    protected void displayDescription() {
        System.out.println("Product Description : "+product.getDescription());
    }

    @Override
    protected void displayPrice() {
        System.out.println("Product Price : "+product.getPrice());
    }


    @Override
    protected void displayBuyButton() {
        System.out.println("Buy Now");
    }
}