package Thread4;

public class BackAccount {

    private double balance = 100.0;


    public synchronized void withdraw(double amount){

        if(balance>amount){
            System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread "+Thread.currentThread().getName()+" got interrupted");;
            }
            balance -=amount;
            System.out.println(Thread.currentThread().getName()+" withdrew "+amount+" , current balance: "+balance);

        }else{
            System.out.println("Insufficient funds for withdrawal");
        }

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
