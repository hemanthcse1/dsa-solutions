package linkedlist.problems;


class LinkNode {
    int val;
    LinkNode next;

    public LinkNode(int val) {
        this.val = val;
    }

}

public class RemoveNthNodeFromEndOfLinkedList {

    public static void main(String[] args) {

        LinkNode n1 = new LinkNode(1);
        LinkNode n2 = new LinkNode(2);
        LinkNode n3 = new LinkNode(3);
        LinkNode n4 = new LinkNode(4);
        LinkNode n5 = new LinkNode(5);
        LinkNode n6 = new LinkNode(6);
        LinkNode n7 = new LinkNode(7);

        /*n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;*/

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        /*n1.next = n2;
        n2.next =  null;*/

        removeNthNodeFromEnd(n1, 4);
    }

    public static void removeNthNodeFromEnd(LinkNode head, int n) {
        LinkNode temp = head;
        printList(temp);


        // find length of linked-list
        LinkNode fast = head;
        LinkNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle of linked-list -> " + slow.val);
        System.out.println("length -> " + fast.val);


        // Nth node to remove
        int nThNode = fast.val - n + 1;
        System.out.println("Node to remove from end of linked list is -> " + nThNode);

        LinkNode previous = new LinkNode(Integer.MIN_VALUE);
        LinkNode tempHead = head;

        for (int i = 1; i < nThNode; i++) {
            previous = tempHead;
            tempHead = tempHead.next;
        }
        previous.next = tempHead.next;

        System.out.println("\n---------after removing nth node-------------\n");
        printList(head);


    }

    public static void printList(LinkNode head){
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(" null ");
    }
}
