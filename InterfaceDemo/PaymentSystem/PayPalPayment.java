public class PayPalPayment implements Payment {

    private String emailAddress;

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment for amount : "+amount+" rs");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Payment mode is Paypal");
    }

    public void showTransactionStatus(){
        Payment.transactionComplete();
    }


}
