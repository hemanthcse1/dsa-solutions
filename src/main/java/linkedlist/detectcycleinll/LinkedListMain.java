package linkedlist.detectcycleinll;



public class LinkedListMain {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n3;

        if (findAndRemoveCycle(n1)) {
            System.out.println("Cycle was detected and removed.");
        } else {
            System.out.println("No cycle detected.");
        }

        Node current = n1;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null\n");
    }

    public static boolean findAndRemoveCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                System.out.println("Cycle detected at node with value: " + fast.data);
                removeCycle(head, slow);
                return true;
            }
        }
        return false;
    }

    private static void removeCycle(Node head, Node meet) {
        Node start = head; // 1
        Node loop = meet;  // 6
        Node prev = null;

        while (start != loop) {
            prev = loop;
            start = start.next;
            loop = loop.next;
        }
        System.out.println("Cycle removed at node linking to node with value: " + loop.data);
        prev.next = null;
    }
}

class Node {

    public int data;
    public Node next;

    public Node(int value){
        this.data = value;
        this.next = null;
    }
}




