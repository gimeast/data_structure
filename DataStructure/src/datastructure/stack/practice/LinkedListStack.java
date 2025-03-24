package datastructure.stack.practice;


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
        Object peek = peek();
        if (pointer.next == null) {
            this.head = null;
            this.top = null;
            return peek;
        }

        Node prevNode = pointer;

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

    public boolean contains(Object data) {
        Node pointer = this.head;
        while (pointer.next != null) {
            if(pointer.data.equals(data))
                return true;
            else
                pointer = pointer.next;
        }

        if(pointer.data.equals(data)) {
            return true;
        }
        return false;
    }

    public int size() {
        int size = 0;

        Node pointer = this.head;
        if(pointer == null)
            return 0;

        while (pointer.next != null) {
            size++;
            pointer = pointer.next;
        }

        return size+1;
    }

    class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
}
