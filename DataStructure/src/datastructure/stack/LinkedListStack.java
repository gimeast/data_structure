package datastructure.stack;

public class LinkedListStack {
    private Node head;
    private Node top;

    public void push(Object data) {
        if (this.head == null) {
            this.head = new Node(data);
            this.top = this.head;
            return;
        }

        this.top.next = new Node(data);
        this.top = this.top.next;
    }

    public Object pop() {
        if (this.top == null) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Node pointer = this.head;
        Node prevNode = pointer;
        Object peek = peek();

        while (pointer.next != null) {
            prevNode = pointer;
            pointer = pointer.next;
        }

        this.top = prevNode;
        this.top.next = null;
        return peek;
    }

    public Object peek() {
        return this.top.data;
    }

    class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }
}
