package datastructure.list.linked.practice;

public class CircularDoublyLinkedList {
    private Node head;
    private Node tail;

    public CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void printAll() {
        Node pointer = this.head;

        StringBuilder stringBuilder = new StringBuilder();
        while (pointer != this.tail) {
            stringBuilder.append(pointer.getValue());
            stringBuilder.append("<->");
            pointer = pointer.next;
        }

        stringBuilder
                .append(pointer.getValue()).append("(tail)")
                .append("<->")
                .append(this.head.getValue()).append("(head)");

        System.out.println(stringBuilder);
    }

    public void printPrevNode(int value) {
        Node pointer = this.head;

        while (pointer != null && pointer.getValue() != value) {
            pointer = pointer.next;
        }

        System.out.printf("%d의 이전 노드의 값은 %d 입니다.\n", value, pointer.prev.getValue());
    }

    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            this.tail = this.head;
            this.head.prev = this.tail;
            return;
        }

        Node tailPrevNode = this.tail;
        this.tail.next = new Node(value);
        this.tail = this.tail.next;
        this.tail.prev = tailPrevNode;
        this.tail.next = this.head;
        this.head.prev = this.tail;
    }

    class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public int getValue() {
            return value;
        }
    }
}
