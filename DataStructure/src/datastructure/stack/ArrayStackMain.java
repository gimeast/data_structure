package datastructure.stack;

public class ArrayStackMain {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push("A");
        stack.push("B");
        stack.push("C");

        Object pop = stack.pop();
        System.out.println("pop = " + pop);
        pop = stack.pop();
        System.out.println("pop = " + pop);

        Object peek = stack.peek();
        System.out.println("peek = " + peek);

        pop = stack.pop();
        System.out.println("pop = " + pop);

        boolean empty = stack.empty();
        System.out.println("empty = " + empty);
    }
}
