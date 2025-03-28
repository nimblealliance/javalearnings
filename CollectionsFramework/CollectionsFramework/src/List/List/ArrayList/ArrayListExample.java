package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args)  {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(80);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains(90));

        for( int x : list){
            System.out.println(x);
        }

        list.remove(2);
        list.add(1,100);
        list.add(200);
        list.add(33);
        System.out.println(list);
        list.remove(Integer.valueOf(200));
        System.out.println(list);


        List<String> list1 = Arrays.asList("Apple", "Banana", "Mango", "Zucchini"); //returns fixed size list, add won't work but set will
        System.out.println(list1.getClass().getName());
        //list1.add("Pineapple");
        list1.set(1,"Pineapple");
        System.out.println(list1);

        //to make list1 as arraylist we can convert it

        List<String> list2 = new ArrayList<>(list1);
        //and now add will work

        list2.add("Cherry");
        System.out.println(list2);

        list2.sort(null);
        System.out.println(list2);





    }

}
