package linkedlist.problems.reorderllist;

public class ListNode {
    private int val;
    private ListNode next;


    public ListNode(int value){
        this.val = value;
        this.next = null;
    }


    public static void main(String[] args){

        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(8);
        ListNode n3 = new ListNode(15);
        ListNode n4 = new ListNode(16);
        ListNode n5 = new ListNode(23);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        ListNode head = n1;
        reorderList(head);

        printList(head);

    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode middle = slow;
        ListNode current = slow.next;
        while (current != null && current.next != null) {
            ListNode nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = middle.next;
            middle.next = nextNode;
        }

        // Step 3: Merge the two halves
        ListNode first = head;
        ListNode second = middle.next;

        while (first != middle) {
            middle.next = second.next;
            second.next = first.next;
            first.next = second;
            first = second.next;
            second = middle.next;
        }
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
