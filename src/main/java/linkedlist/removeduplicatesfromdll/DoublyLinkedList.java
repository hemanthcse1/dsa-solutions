package linkedlist.removeduplicatesfromdll;

import java.util.HashMap;
import java.util.Map;

public class DoublyLinkedList {
    Node head;

    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeDuplicates() {
        Map<Integer, Integer> count = new HashMap<>();
        Node current = head;

        while (current != null) {
            count.put(current.data, count.getOrDefault(current.data, 0) + 1);
            current = current.next;
        }

        current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            if (count.get(current.data) > 1) {
                deleteNode(current);
            }
            current = nextNode;
        }
    }

    private void deleteNode(Node del) {
        if (head == null || del == null) {
            return;
        }

        if (head == del) {
            head = del.next;
        }

        if (del.next != null) {
            del.next.prev = del.prev;
        }

        if (del.prev != null) {
            del.prev.next = del.next;
        }

        del.prev = del.next = null;
    }
}
