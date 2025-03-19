package datastructure.list.linked.circular;

public class CircularSinglyLinkedList {
    private Node head;
    private Node tail;

    public CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            this.tail = this.head;
            return;
        }

        Node pointer = this.tail;
        pointer.next = new Node(value);
        this.tail = pointer.next;
        this.tail.next = this.head;
    }

    public void printAll() {
        Node pointer = this.head;

        StringBuilder stringBuilder = new StringBuilder();
        while(pointer != this.tail) {
            stringBuilder.append(pointer.getValue());
            stringBuilder.append("->");
            pointer = pointer.next;
        }

        stringBuilder.append(pointer.getValue());
        stringBuilder.append("(tail)->");

        stringBuilder.append(this.head.getValue());
        stringBuilder.append("(head)");

        System.out.println(stringBuilder);
    }

    public void delete(int value) {
        Node pointer = this.head;
        if (pointer.value == value) {
            this.head = pointer.next;
            this.tail.next = this.head;
            return;
        }

        Node prevNode = pointer;

        while(pointer.value != value) {
            prevNode = pointer;
            pointer = pointer.next;
        }

        if (this.tail.value == value) {
            this.tail = prevNode;
            this.tail.next = this.head;
        } else {
            prevNode.next = pointer.next;
        }
    }

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return value;
        }
    }
}
