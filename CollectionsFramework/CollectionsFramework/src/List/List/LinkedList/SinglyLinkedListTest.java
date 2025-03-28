package List.LinkedList;


public class SinglyLinkedListTest {

    public static void main(String[] args) {

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();

        node1.value=1;
        node1.nextNode =node2;

        node2.value=2;
        node2.nextNode =node3;

        node3.value=3;
        node3.nextNode=null;


        // node1 is pointing to next node , node2 , which is pointing to node 3 which is at the end is the end of the list hence the pointer is null

        System.out.println(node1.getValue());
        System.out.println(node1.getNextNode());

        System.out.println(node2.getValue());
        System.out.println(node2.getNextNode());

        System.out.println(node3.getValue());
        System.out.println(node3.getNextNode());

    }

}


class Node{

    int value;
    Node nextNode;

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nextNode=" + nextNode +
                '}';
    }
}