package datastructure.stack.practice;

public class ArrayStackMain {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);

        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());

        stack.push("4");
        stack.push(5);

        System.out.println("stack.contains(\"4\") = " + stack.contains("4"));
        System.out.println("stack.contains(5) = " + stack.contains(5));

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());

        System.out.println("stack.size() = " + stack.size());
    }
}
