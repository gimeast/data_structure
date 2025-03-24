package datastructure.stack.practice;

public class LinkedListStackMain {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push("1");
        linkedListStack.push("2");
        linkedListStack.push("3");

        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());

        linkedListStack.push(4);
        linkedListStack.push(5);

        System.out.println("linkedListStack.contains(5) = " + linkedListStack.contains(5));
        System.out.println("linkedListStack.contains(6) = " + linkedListStack.contains(6));
        System.out.println("linkedListStack.size() = " + linkedListStack.size());
    }
}
