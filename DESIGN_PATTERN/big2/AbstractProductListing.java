package big2;



public abstract class AbstractProductListing {
    protected Product product;

    public AbstractProductListing(Product product) {
       this. product = product;
    }

    public void displayListing() {

        displayName();
        displayDescription();
        displayPrice();
        displayBuyButton();
    }

    protected abstract void displayName();
    protected abstract void displayDescription();
    protected abstract void displayPrice();

    protected abstract void displayBuyButton();
}

