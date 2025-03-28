package List.CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Item1");
        list.add("Item2");
        list.add("Item3");


        Thread reader_thread = new Thread(() ->
        {
            try {

                while(true) {
                    for (String i : list) {
                        System.out.println("Reading item: " +i);
                        Thread.sleep(100);
                    }

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        );

        Thread writer_thread= new Thread(() ->
        {
            try {
                Thread.sleep(5);
                list.add("Item4");

                Thread.sleep(500);
                list.remove("Item3");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        );

        reader_thread.start();
        writer_thread.start();

        try {
            reader_thread.join();
            writer_thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
