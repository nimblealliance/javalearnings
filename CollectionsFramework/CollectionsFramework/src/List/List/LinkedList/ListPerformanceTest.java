package List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    public static void main(String[] args) {
        int operations = 100_00000;

        // Test ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            arrayList.add(i); // Inserting at the beginning
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList insertion at beginning: " + (endTime - startTime) / 1_000_000 + " ms");

        // Test LinkedList
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            linkedList.add(i); // Inserting at the beginning
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList insertion at beginning: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
