package datastructure.list.linked.practice;


import org.w3c.dom.Node;

/**
 * 단일 연결 리스트를 구현하고 삽입 기능에서 중복을 허용하지 않도록 만들기
 */
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void append(int value) {
        if(this.head == null) {
            this.head = new Node(value);
            return;
        }

        Node pointer = this.head;
        //중복 허용하지 않기 위한 전체 검색
        while (pointer != null && pointer.getValue() != value) {
            pointer = pointer.next;
        }

        if(pointer != null) {
            System.out.printf("%d은 중복된 값으로 입력하실 수 없습니다.\n", value);
            pointer = null;
            return;
        }

        pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        pointer.next = new Node(value);
    }

    public void delete(int value) {
        if (this.head.getValue() == value) {
            this.head = this.head.next;
            return;
        }

        Node pointer = this.head;
        Node prevNode = pointer;
        while (pointer != null && pointer.getValue() != value) {
            prevNode = pointer;
            pointer = pointer.next;
        }

        if (pointer.next == null) {
            prevNode.next = null;
        } else {
            prevNode.next = pointer.next;
        }

    }

    public void printAll() {
        Node pointer = this.head;

        StringBuilder stringBuilder = new StringBuilder();
        while (pointer.next != null) {
            stringBuilder.append(pointer.getValue());
            stringBuilder.append("->");

            pointer = pointer.next;
        }

        stringBuilder.append(pointer.getValue());

        System.out.println(stringBuilder);
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
