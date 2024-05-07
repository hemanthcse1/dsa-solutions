package linkedlist.findmiddleoflinkedlist;


public class LinkedList {

    public static void main(String[] args){

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);
        Node n7 = new Node(70);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;

        Node pointer = n1;
        while (pointer != null){
            System.out.print(pointer.value+" -> ");
            pointer = pointer.next;
        }
        System.out.println(" null ");


        System.out.println(" middle of linked-list is -> "+findMiddle(n1).value);

    }

    private static Node findMiddle(Node head){
        if (head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
