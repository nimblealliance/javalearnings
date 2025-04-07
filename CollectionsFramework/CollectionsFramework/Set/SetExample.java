package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> setexample = new HashSet<>();
        setexample.add("Rahul");
        setexample.add("Menon");
        setexample.add("Nimble");
        setexample.add("Nimble3");
        setexample.add("Nimble7");

        System.out.println(setexample);
        for (String i : setexample){
            System.out.println(i);
        }


        System.out.println();
        Set<String> setexample2 = new LinkedHashSet<>();
        setexample2.add("Rahul");
        setexample2.add("Menon");
        setexample2.add("Nimble");
        setexample2.add("Nimble3");
        setexample2.add("Nimble7");

        System.out.println(setexample2);
        for (String i : setexample2){
            System.out.println(i);
        }

    }
}
