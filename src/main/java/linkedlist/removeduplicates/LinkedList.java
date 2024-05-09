package linkedlist.removeduplicates;

public class LinkedList {

    public static void main(String[] args) {

        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(5);
        Node n7 = new Node(6);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;

        Node pointer = n1;
        while (pointer != null) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.next;
        }
        System.out.print(" null ");

        System.out.println("\n------------------------------\n");

        Node head = removeDuplicates(n1);

        System.out.println("\n------------------------------\n");
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.print(" null ");

    }

    public static Node removeDuplicates(Node head) {

        if (head == null ||head.next == null) {
            return head;
        }

        Node p1 = head;
        Node p2 = head.next;

        while (p2 != null) {
            if (p2.value == p1.value) {
                p2 = p2.next;
            } else {
                p1.next = p2;
                p1 = p2;
                p2 = p2.next;
            }
        }
        p1.next = null;
        return head;
    }
}
