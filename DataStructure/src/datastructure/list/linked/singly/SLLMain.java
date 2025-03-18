package datastructure.list.linked.singly;

public class SLLMain {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(30);
        singlyLinkedList.append(10);
        singlyLinkedList.append(13);
        singlyLinkedList.append(11);
        singlyLinkedList.append(19);

        singlyLinkedList.delete(30);

        singlyLinkedList.printAll();
    }
}
