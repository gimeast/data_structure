package datastructure.list.linked.practice;

public class Q2Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        circularDoublyLinkedList.append(1);
        circularDoublyLinkedList.append(2);
        circularDoublyLinkedList.append(3);
        circularDoublyLinkedList.append(4);
        circularDoublyLinkedList.append(5);

        circularDoublyLinkedList.printPrevNode(1);
        circularDoublyLinkedList.printAll();
    }
}
