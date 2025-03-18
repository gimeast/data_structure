package datastructure.list.linked.doubly;

public class DLLMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.append(1);
        doublyLinkedList.append(3);
        doublyLinkedList.append(2);
        doublyLinkedList.append(20);
        doublyLinkedList.append(19);

        doublyLinkedList.printAll();

        doublyLinkedList.delete(1);
        doublyLinkedList.printAll();
        doublyLinkedList.delete(2);
        doublyLinkedList.printAll();
        doublyLinkedList.delete(19);
        doublyLinkedList.printAll();
    }
}
