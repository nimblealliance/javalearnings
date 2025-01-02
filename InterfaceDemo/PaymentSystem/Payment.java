public interface Payment {

    void processPayment(double amount);

    void showPaymentDetails();

    default void validatePayment(){
        System.out.println("Payment has been validated");
    }

    static void transactionComplete(){
        System.out.println("Transaction completed successfully");
    }
}
