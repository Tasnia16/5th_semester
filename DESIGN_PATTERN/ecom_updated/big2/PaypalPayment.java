package big2;

class PaypalPayment implements PaymentStrategy{
    private String username;
    private String password;
    private Double deductedAmount;

    public PaypalPayment(){

    }
    public PaypalPayment(String username, String password){
        this.username=username;
        this.password=password;
    }
    public void processPayment(Double amount){
        //check information
        deductedAmount=amount/100;
        //check balance
        System.out.println("Payment done using paypal, Amount deducted: "+deductedAmount);
    }
    public PaypalPayment setPayment(){
        System.out.println("Enter username: ");
        username=scanner.nextLine();
        System.out.println("Enter password: ");
        password=scanner.nextLine();

        return new PaypalPayment(username,password);
    }
}
