package List.LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {

        DoublyNode node1 = new DoublyNode();
        DoublyNode node2 = new DoublyNode();
        DoublyNode node3 = new DoublyNode();

        node1.value=1;
        node1.nextNode =node2;
        node1.previousNode=null;

        node2.value=2;
        node2.nextNode =node3;
        node2.previousNode=node1;

        node3.value=3;
        node3.nextNode=null;
        node3.previousNode=node2;

        System.out.println(node1.getValue());
        System.out.println(node1.getPreviousNode());
        System.out.println(node1.getNextNode());

        System.out.println();
        System.out.println(node2.getValue());
        System.out.println(node2.getPreviousNode());
        System.out.println(node2.getNextNode());

        System.out.println();
        System.out.println(node3.getValue());
        System.out.println(node3.getPreviousNode());
        System.out.println(node3.getNextNode());

    }
}

class DoublyNode {

    int value;
    DoublyNode nextNode;
    DoublyNode previousNode;

    public int getValue() {
        return value;
    }

    public DoublyNode getNextNode() {
        return nextNode;
    }

    public DoublyNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyNode previousNode) {
        this.previousNode = previousNode;
    }

//    @Override
//    public String toString() {
//        return "DoublyNode{" +
//                "value=" + value +
//                ", nextNode=" + nextNode +
//                ", previousNode=" + previousNode +
//                '}';
//   }
}

