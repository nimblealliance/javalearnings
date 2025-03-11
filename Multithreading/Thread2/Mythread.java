package Thread2;

public class Mythread extends Thread{

    @Override
    public void run() {
        System.out.println("t1 is RUNNING");
        try {
            Thread.currentThread().join(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After joining "+Thread.currentThread().getState());
    }

    public static void main(String[] args) throws InterruptedException {

        Mythread t1 = new Mythread();
        System.out.println("t1 before starting "+t1.getState());
        t1.start();
        System.out.println("t1 after starting "+t1.getState());
        Thread.sleep(1000);
        System.out.println("When main thread was sleeping , t1 was in "+t1.getState());
        t1.join();
        System.out.println("At last t1 got " +t1.getState());

    }

}
