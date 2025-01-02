public class BankTransfer implements Payment{

   private String accountName;
   private String accountNumber;

    public BankTransfer(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
   public void processPayment(double amount) {
       System.out.println("Processing bank transfer for amount : "+amount+" rs");
   }

   @Override
   public void showPaymentDetails() {
       System.out.println("Payment mode is Bank Transfer");
   }

    public void showTransactionStatus(){
        Payment.transactionComplete();
    }
}
