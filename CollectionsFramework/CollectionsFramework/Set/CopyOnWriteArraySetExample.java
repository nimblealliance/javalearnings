package Set;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {

    public static void main(String[] args) {

        Set<String> set = new CopyOnWriteArraySet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        System.out.println(set);
        for( String i : set){ //has a stable snapshot of the set with 3 values , the fourth value we add doesn't show up in the output , the fourth value gets added to a copy of the
            //set and not to the snapshot of for,iterator.

            if(i.equals("Three")){
                set.add("Four");
            }
            System.out.println(i);
        }
        System.out.println(set);


    }
}
