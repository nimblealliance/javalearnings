package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class Producer implements Runnable{

    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
    private int value=0;

    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }


    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);
                queue.put(value++);
                System.out.println("Producer produced :"+value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Consumer implements Runnable{

    private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                 Thread.sleep(1000);
                 Integer value = queue.take();
                 System.out.println("Consumer consumed :"+value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ArrayBlockingQueueExample {

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread (new Consumer(queue));
        producer.start();
        consumer.start();

    }
}
