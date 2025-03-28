package List.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorMultithreadedExample {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
                vector.add(i);
            }
        });

        Thread t2 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
                vector.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Size of "+arrayList.getClass().getSimpleName()+": "+ arrayList.size());
        System.out.println("Size of "+vector.getClass().getSimpleName()+": "+ vector.size());

    }
}