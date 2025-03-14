package Thread7;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private static final ReentrantLock lock = new ReentrantLock();
    private static int count=0;


    public static void outerMethod(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" is in Outer method "+", the lock count is "+lock.getHoldCount());
            innerMethod();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Outer Lock is being release by "+Thread.currentThread().getName()+" , the lock count is "+lock.getHoldCount());
            lock.unlock();
            System.out.println("Outer Lock released by "+Thread.currentThread().getName()+" , the lock count is "+lock.getHoldCount());
        }
    }

    public static void innerMethod(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" is in Inner method "+", the lock count is "+lock.getHoldCount());
            Thread.sleep(3000);
            count++;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Inner Lock is being release by "+Thread.currentThread().getName()+" , the lock count is "+lock.getHoldCount());
            lock.unlock();
            System.out.println("Inner Lock released by "+Thread.currentThread().getName()+" , the lock count is "+lock.getHoldCount());
        }
    }

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                outerMethod();
            }
        };

        Thread t1 = new Thread(task , "t1");
        Thread t2 = new Thread(task , "t2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The final count is "+count);
    }
}


