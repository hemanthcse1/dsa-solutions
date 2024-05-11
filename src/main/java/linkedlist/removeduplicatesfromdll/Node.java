package linkedlist.removeduplicatesfromdll;

public class Node {

    int data;
    Node prev;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
        this.prev = null;
    }
}
