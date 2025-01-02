public class CreditCardPayment implements Payment{

    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment for amount : "+amount+" rs");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Payment mode is Credit card");
    }

    public void showTransactionStatus(){
        Payment.transactionComplete();
    }
}
