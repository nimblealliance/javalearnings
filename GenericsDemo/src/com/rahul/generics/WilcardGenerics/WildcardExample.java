import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(10);

        printList(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hi");
        stringList.add("My name is");
        stringList.add("Slim shady");

        //printList(stringList);  doesn't work


        //below causes runtime error
        List list = new ArrayList<>();
        list.add("Hello");
        list.add(1);

        try {
            String str = (String) list.get(1);
        }
        catch (ClassCastException cce){
            System.out.println("Yo that won't work dawg!");
        }


        //while generics causes compile time error which is good to catch the error early
//        List<String> stringlist = new ArrayList<>();
//        stringlist.add("Hello");
//        stringlist.add(1);




    }

    public static void printList(List<? extends Number > list){

        for (Object element : list){
            System.out.println(element);
        }
    }

}
