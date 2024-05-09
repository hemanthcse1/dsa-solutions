package linkedlist.removeallduplicatesfromlinkedlist;

import linkedlist.removeduplicates.Node;

public class LinkedList {


    public static void main(String[] args){


        Node n1 = new Node(1);
        Node n2 = new Node(1);
        Node n3 = new Node(1);
        Node n4 = new Node(2);
        Node n5 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node pointer = n1;
        while (pointer != null){
            System.out.print(pointer.value+" -> ");
            pointer = pointer.next;
        }
        System.out.println(" null ");


        System.out.println("\n-------------------------\n");
        Node head = removeAllDuplicates(n1);

        while (head != null){
            System.out.print(head.value+" -> ");
            head = head.next;
        }
        System.out.println(" null ");
    }

    public static Node removeAllDuplicates(Node head){

        if (head != null || head.next != null){
            return head;
        }

        Node p1 = head;
        Node p2 = head.next;
        int duplicate = Integer.MIN_VALUE;

        while (p2 != null){
            if (p2.value == p1.value){
                duplicate = p2.value;
                p1 = p2;
                p2 = p2.next;
            }else {
                if (p1.value == duplicate){
                    p1.next = null;
                    p1 = p2;
                    p2 = p2.next;
                }else {
                    p1.next = p2;
                    p1 = p2;
                    p2 = p2.next;
                }
            }
        }

        return head;

    }
}
