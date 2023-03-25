package Big;

public class CryptocurrencyPayment implements Payment {
    private String walletAddress;
    private String privateKey;

    // constructor and other methods

    @Override
    public boolean pay(double amount) {
        // logic to process cryptocurrency payment
        return false;
    }
}
