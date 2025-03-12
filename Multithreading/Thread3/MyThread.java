package Thread3;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            System.out.println("Interrupted "+ e);
//        }
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted "+ e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
//        Thread.sleep(10);
//        Thread.currentThread().join();

    }
}













//start run sleep join setPriority interrupt yield setDaemon getState