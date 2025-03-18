package datastructure;

/**
 * 노드
 */
public class Node {
    private int value; //값
    public Node next; //포인터

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

}
