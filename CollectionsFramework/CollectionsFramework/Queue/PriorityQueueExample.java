package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(2);
        pq.add(24);
        pq.add(31);
        pq.add(1);
        System.out.println(pq); //outputting a queue won't show it ordered since its a queue and the only thing that matters is how and what things come out not what's
        // happening inside , PriorityQueue takes care of how things come out and it has nothing to do with what's happening inside , so its not sorted.
        System.out.println(pq.remove()); // even if 1 was added at the last , the way Integers are dealt with in PQ is using min-heap which makes sure the lowest integer comes at top
        // or is at the head or comes out first , i.e 1 comes out first . min-heap is used by default for natural ordering

        //Now let me give my custom comparator in another PQ which will be same as the above

        PriorityQueue<Integer> pq2 = new PriorityQueue<>((o1 , o2) -> o2-o1);
        pq2.add(15);
        pq2.add(2);
        pq2.add(24);
        pq2.add(31);
        pq2.add(1);
        System.out.println(pq2);
        System.out.println(pq2.remove());

        //now since I wrote my custom comparator which makes largest elements to come first , removing returns 31 or the highest value. Also by giving my own comparator when we sout pq2
        // we see it got sorted as well (highest to lowest) but that didn't happen in default pq in our first example


    }
}
