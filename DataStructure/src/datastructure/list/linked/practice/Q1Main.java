package datastructure.list.linked.practice;

public class Q1Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(1);
        singlyLinkedList.append(1);
        singlyLinkedList.append(2);
        singlyLinkedList.append(5);
        singlyLinkedList.append(3);
        singlyLinkedList.append(4);

        singlyLinkedList.delete(2);

        singlyLinkedList.printAll();
    }
}
