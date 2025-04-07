package Map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(69,"Rahul");
        map.put(420,"Archana");
        map.put(19,"Dudu");
        map.put(6,"Bubu");

        System.out.println(map);
        System.out.println(map.get(10));

        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(69));
        System.out.println(map.containsValue("Bubu"));

        System.out.println();
        System.out.println("To get only keys");
        Set<Integer> keys = map.keySet();
        for (Integer i : keys){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("To get only values:");
        Collection<String> values = map.values();
        for(String value : values){
            System.out.println(value);
        }

        System.out.println();
        System.out.println("To get Key and value pairs");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println("Key:"+entry.getKey()+", Value:"+entry.getValue());
        }
    }
}
