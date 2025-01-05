public class Main {

    public static void main(String[] args) {

        GenericStack stack = new GenericStack<>();
        System.out.println(stack.getSize());
        stack.push("String");
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());
        stack.push(1);
        stack.push('C');
        System.out.println(stack);
        System.out.println(stack.getSize());
        stack.pop();
        System.out.println(stack.getSize());
        stack.peek();
        System.out.println(stack);


    }
}
