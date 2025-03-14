package Thread5;

public class Test {

    public static void main(String[] args) {

        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        Thread thread1 = new Thread(t1,"t1");
        Thread thread2 = new Thread(t2,"t2");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(counter.getCount());

    }
}
