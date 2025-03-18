package datastructure.list.linked.singly;


import datastructure.Node;

/**
 * 단일연결리스트
 */
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public SinglyLinkedList(int value) {
        this.head = new Node(value, null);
    }

    /**
     * 모든 노드 출력
     */
    public void printAll() {
        Node pointer = this.head;

        StringBuilder builder = new StringBuilder();
        while(pointer.next != null) {
            builder.append(pointer.getValue());
            builder.append("->");
            pointer = pointer.next;
        }

        builder.append(pointer.getValue());
        System.out.println(builder);
    }

    /**
     * 단일 연결 리스트 끝에 Node 추가
     * @param value
     */
    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value, null);
            return;
        }

        Node pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        pointer.next = new Node(value, null);
    }

    /**
     * 값이 같은 node 삭제
     * @param value
     */
    public void delete(int value) {
        Node pointer = this.head;

        //**첫번째 노드 삭제인 경우**
        if (pointer.getValue() == value) {
            Node removeNode = pointer;
            this.head = pointer.next;
            removeNode = null; //초기화
            return;
        }

        Node temp = pointer; //앞에 위치한 노드로 사용
        //포인터 찾는 로직
        while (pointer != null && pointer.getValue() != value) {
            temp = pointer; //앞 노드
            pointer = pointer.next;
        }

        if (pointer.next == null) { //**마지막 노드 삭제인 경우**
            temp.next = null;
        } else { //**중간 노드 삭제인 경우**
            temp.next = pointer.next; //앞 노드와 다음 노드를 이어준다.
        }
        pointer = null; //초기화
    }
}
