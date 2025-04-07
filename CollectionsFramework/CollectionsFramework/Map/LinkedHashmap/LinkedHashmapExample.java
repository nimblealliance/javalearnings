package Map.LinkedHashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapExample {

    public static void main(String[] args) {


        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple",20);
        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Banana",90);

        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();

        //order of insertion is maintained
        for (Map.Entry<String, Integer> entry :entries ){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        for (String keys : linkedHashMap.keySet()){
            System.out.println(linkedHashMap.get(keys));
        }
    }
}
