package List.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(2);
        System.out.println(linkedList);
        for (Integer x : linkedList){
            System.out.println(x);
        }

        linkedList.set(2,69);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());

        System.out.println(linkedList);
        linkedList.sort((o1 , o2)->o2-o1);
        System.out.println(linkedList);
        linkedList.pop();
    }
}


