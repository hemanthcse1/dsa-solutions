package linkedlist.doublylinkedlist.different;

public class DoublyLinkedList {
    Node head;

    public DoublyLinkedList(){
        this.head = null;
    }

    public void insertAtBeginning(int value){
        Node temp = head;
        Node newNode = new Node(value);
        newNode.next = head;

        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while (last != null){
            head = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }
}
