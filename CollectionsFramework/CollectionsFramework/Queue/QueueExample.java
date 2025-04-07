package Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(2); //just an example to demonstrate add and offer by using a queue with fixed size.
        queue.add(1);
        queue.add(2);
        //queue.add(3); //throws exception since the queue of size 2 is full and we are entering the third element
        queue.offer(3); // no exception here , since offer is just add without any exceptions , nothing happens here as the queue is already full
        System.out.println(queue.size());

        queue.remove();
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue.size());
        //queue.remove(); //now this will throw exception because the queue became empty during the last remove operation.
        queue.poll(); // no exception here , since poll is just remove without any exception , nothing happens here as the queue is already empty.

        queue.add(2);
        queue.add(1);
        System.out.println(queue.element()); //throws exception if there's nothing to view i.e. queue is empty
        System.out.println(queue.peek()); // peek is just element without any exception , nothing happens here if there's nothing to view i.e. queue is empty
    }
}
