package big2;

class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    private String cvv;
    private String expirationDate;
    private Double deductedAmount;

    public CreditCardPayment(){

    }
    public CreditCardPayment(String cardNumber, String cvv, String expirationDate){
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.expirationDate=expirationDate;
    }

    public void processPayment(Double amount){
        //check information
        deductedAmount=amount;
        //check balance
        System.out.println("Payment done using credit card, Amount deducted: "+deductedAmount);
    }
    public CreditCardPayment setPayment(){
        System.out.println("Enter card Number: ");
        cardNumber=scanner.nextLine();
        System.out.println("Enter cvv: ");
        cvv=scanner.nextLine();
        System.out.println("Enter expirationDate: ");
        expirationDate=scanner.nextLine();

        return new CreditCardPayment(cardNumber,cvv,expirationDate);
    }
}