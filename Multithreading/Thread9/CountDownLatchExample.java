package Thread9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {

        int numberCount=3;

        ExecutorService executorService = Executors.newFixedThreadPool(numberCount);
        CountDownLatch latch = new CountDownLatch(numberCount);

        executorService.submit(new Runner(latch));
        executorService.submit(new Runner(latch));
        executorService.submit(new Runner(latch));

        latch.await();
        System.out.println("Main thread is running");
        executorService.shutdown();
    }
}


class Runner implements Runnable{

    private final CountDownLatch latch;

    public Runner(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Running the thread "+Thread.currentThread().getName());
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }finally {
            latch.countDown();
            System.out.println("Current latch count :"+latch.getCount());
        }

    }
}