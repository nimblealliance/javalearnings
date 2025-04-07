package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addLast(10);
        deque.offerFirst(20);
        deque.offerLast(1);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println(deque.peekLast());

    }
}
