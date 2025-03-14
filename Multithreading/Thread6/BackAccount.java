package Thread6;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BackAccount {

    private double balance = 100.0;

    private Lock lock = new ReentrantLock();
    public void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName()+" acquired the lock");
                if (balance >= amount) {
                    try {
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " , current balance: " + balance);

                    } catch (InterruptedException e) {
                        System.out.println("Thread " + Thread.currentThread().getName() + " got interrupted");
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println("Insufficient funds for withdrawal");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName()+" could not acquire the lock");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
