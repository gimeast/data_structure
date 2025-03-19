package datastructure.list.linked.circular;

public class CLLMain {
    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.append(11);
        circularSinglyLinkedList.append(9);
        circularSinglyLinkedList.append(27);
        circularSinglyLinkedList.append(41);
        circularSinglyLinkedList.append(3);

        circularSinglyLinkedList.delete(11);
        circularSinglyLinkedList.delete(27);
        circularSinglyLinkedList.delete(41);

        circularSinglyLinkedList.printAll();
    }
}
