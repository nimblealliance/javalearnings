public class Main {

    public static void main(String[] args) {

        CreditCardPayment creditCard = new CreditCardPayment("12234-44445-3434","Rahul");
        creditCard.processPayment(200.0);
        creditCard.showPaymentDetails();
        creditCard.validatePayment();
        creditCard.showTransactionStatus();
        System.out.println();

        PayPalPayment paypal = new PayPalPayment("johndoe@gmail.com");
        paypal.processPayment(150.0);
        paypal.showPaymentDetails();
        paypal.validatePayment();
        paypal.showTransactionStatus();
        System.out.println();

        BankTransfer bankTransfer = new BankTransfer("Archana","9874-4473-3820");
        bankTransfer.processPayment(500.0);
        bankTransfer.showPaymentDetails();
        bankTransfer.validatePayment();
        bankTransfer.showTransactionStatus();
        System.out.println();
    }
}
