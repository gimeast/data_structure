package datastructure.list.linked.doubly;

import org.w3c.dom.Node;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    /**
     * 앞 노드 출력
     * @param value
     */
    public void printPrevNode(int value) {
        if (this.head == null) {
            System.out.println("이중 연결 리스트가 비어 있습니다.");
            return;
        }

        if (this.head.getValue() == value) {
            System.out.printf("노드 %s 의 앞 노드는 존재하지 않습니다.%n", value);
            return;
        }

        Node pointer = this.head;
        while (pointer != null && pointer.getValue() != value) {
            pointer = pointer.next;
        }

        if (pointer == null) {
            System.out.printf("노드 %s 은 존재하지 않습니다\n", value);
        } else {
            System.out.printf("노드 %s 의 앞 노드의 값은 %s 입니다.\n", value, pointer.prev.getValue());
        }
    }

    public void printAll() {
        Node pointer = this.head;

        StringBuilder stringBuilder = new StringBuilder();
        while (pointer.next != null) {
            stringBuilder.append(pointer.value);
            stringBuilder.append("<->");
            pointer = pointer.next;
        }

        stringBuilder.append(pointer.value);
        System.out.println(stringBuilder);
    }

    /**
     * 이중 연결 리스트 끝에 Node 추가
     * @param value
     */
    public void append(int value) {
        //head
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }

        //포인터 이동
        Node pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        //이전 노드와 신규 노드 연결
        Node newNode = new Node(value);
        newNode.prev = pointer;
        pointer.next = newNode;
    }

    public void delete(int value) {
        Node pointer = this.head;

        //head 삭제
        if (pointer.getValue() == value) {
            this.head = pointer.next;
            pointer = null;
            return;
        }

        Node prevNode = pointer;
        while (pointer != null && pointer.value != value) { //노드 찾는 로직
            prevNode = pointer;
            pointer = pointer.next;
        }

        Node nextNode = pointer.next;
        //tail 삭제
        if(nextNode == null) {
            prevNode.next = null;
        } else { //mid 삭제
            nextNode.prev = prevNode;
            prevNode.next = pointer.next;
        }
        pointer = null;
    }

    class Node {
        private int value; //값
        private Node prev; //이전 포인터
        private Node next; //다음 포인터

        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public int getValue() {
            return value;
        }
    }
}
