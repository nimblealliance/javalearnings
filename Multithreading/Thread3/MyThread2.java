package Thread3;

public class MyThread2 extends Thread{

    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Running thread: "+Thread.currentThread().getName()+" , current count"+i);
//
//        }
        try {
            System.out.println("3. RUNNING");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread : "+Thread.currentThread().getName()+" got interrupted");;
        }
    }

    public static void main(String[] args) throws InterruptedException {

//        MyThread2 t1 = new MyThread2();
//        t1.start();
//        t1.setName("T1");
        MyThread2 t2 = new MyThread2();
        System.out.println("1. "+t2.getState());
        Thread.currentThread().setPriority(1);
        t2.setPriority(10);
        t2.setDaemon(true);
        t2.start();
        t2.setName("T2");


//        t2.interrupt();
//        t2.join();
        System.out.println("2. "+t2.getState());
//        Thread.sleep(4000);
        System.out.println("4. "+t2.getState());
//        Thread.sleep(2000);
        System.out.println("5. "+t2.getState());


    }
}
