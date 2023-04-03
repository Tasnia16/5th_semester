package big2;



class CryptoPayment implements PaymentStrategy{
    private String walletNumber;
    private String transactionToken;
    private Double deductedAmount;

    public CryptoPayment(){

    }
    public CryptoPayment(String walletNumber, String transactionToken){
        this.walletNumber=walletNumber;
    }
    public void processPayment(Double amount){
        //check information

        deductedAmount=amount/2879900.18;

        //check balance

        System.out.println("Payment done using paypal, Amount deducted: "+deductedAmount);
    }
    public CryptoPayment factoryMethod(){
        System.out.println("Enter walletNumber: ");
        walletNumber=scanner.nextLine();
        System.out.println("Enter TxToken: ");
        transactionToken=scanner.nextLine();

        return new CryptoPayment(walletNumber,transactionToken);
    }
}