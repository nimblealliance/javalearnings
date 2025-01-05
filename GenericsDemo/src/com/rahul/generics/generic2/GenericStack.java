import java.util.ArrayList;

public class GenericStack<T> {
    private int size=0;
    ArrayList<T> stack = new ArrayList<>();

    public GenericStack() {
    }

    public int getSize() {
        return size;
    }

    public void push(T thingToPush){
        stack.add(thingToPush);
        size++;
        System.out.println("Pushing to the stack");
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Removing the last element...");
            int length=stack.toArray().length-1;
            System.out.println("The element which was removed is "+stack.get(length));
            stack.remove(length);
            size--;
        }
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            int length=stack.toArray().length-1;
            System.out.println("The top element is "+stack.get(length));
        }
    }

    @Override
    public String toString() {
        return "stack=" + stack;
    }
}
