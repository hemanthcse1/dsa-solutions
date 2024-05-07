package linkedlist.mergesortedlinkedlist;

import linkedlist.findmiddleoflinkedlist.Node;

public class LinkedList {


    public static void main(String[] args) {


        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(6);
        Node n4 = new Node(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        Node n11 = new Node(4);
        Node n12 = new Node(7);
        Node n13 = new Node(9);

        n11.next = n12;
        n12.next = n13;
        n13.next = null;


        Node node1ptr = n1;
        while (node1ptr != null) {
            System.out.print(node1ptr.value + " -> ");
            node1ptr = node1ptr.next;
        }
        System.out.print(" null ");

        System.out.print("\n\n----------------------------\n\n");

        Node node2Ptr = n11;
        while (node2Ptr != null) {
            System.out.print(node2Ptr.value + " -> ");
            node2Ptr = node2Ptr.next;
        }
        System.out.print(" null ");


        System.out.print("\n\n----------------------------\n\n");
        Node resultNode = mergeSortedLinkedList(n1, n11);
        while (resultNode != null) {
            System.out.print(resultNode.value + " -> ");
            resultNode = resultNode.next;
        }
        System.out.print(" null ");

        System.out.print("\n\n----------------------------\n\n");
    }

    public static Node mergeSortedLinkedList(Node list1, Node list2) {


        Node returnNode = new Node(Integer.MIN_VALUE);
        Node headNode = returnNode;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                returnNode.next = list1;
                list1 = list1.next;
            } else{
                returnNode.next = list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        }

        if (list1 == null){
            returnNode.next = list2;
        }
        if (list2 == null){
            returnNode.next = list1;
        }

        return headNode.next;

    }
}
