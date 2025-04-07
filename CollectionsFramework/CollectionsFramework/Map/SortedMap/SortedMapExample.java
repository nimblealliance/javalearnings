package Map.SortedMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {

        Comparator<Integer> comparator = (o1, o2) -> o2-o1;
        SortedMap<Integer,String> map = new TreeMap<>(comparator);
        map.put(91,"Rahul");
        map.put(99,"Archana");
        map.put(69,"Joemama");
        map.put(69420,"Nimble");
        System.out.println(map);


    }
}
