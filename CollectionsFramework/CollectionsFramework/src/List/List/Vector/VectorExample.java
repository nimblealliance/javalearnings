package List.Vector;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());

    }
}
