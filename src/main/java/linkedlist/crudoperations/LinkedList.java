package linkedlist.crudoperations;

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

        System.out.println("\n\n------------------Original LinkedList-----------------\n");

        Node pointer = n1;
        while (pointer != null){
            System.out.print(pointer.value+" -> ");
            pointer = pointer.next;
        }

        System.out.print("null");

        System.out.println("\n\n------------------Adding new node at the beginning-----------------\n");


        pointer = addNodeAtBeginning(n1,9);
        while (pointer != null){
            System.out.print(pointer.value+" -> ");
            pointer = pointer.next;
        }
        System.out.print("null");


        System.out.println("\n\n------------------Adding new node at the end-----------------\n");

        addNodeAtEnd(n1,71);
        pointer = n1;
        while (pointer != null){
            System.out.print(pointer.value+" -> ");
            pointer = pointer.next;
        }
        System.out.print("null");

        System.out.println("\n\n------------------Adding new node at specific potion-----------------\n");

        addNodeAtSpecificPosition(n1,4, 41);
        pointer = n1;
        while (pointer != null){
            System.out.print(pointer.value+" -> ");
            pointer = pointer.next;
        }
        System.out.print("null");


        System.out.println("\n\n------------------Delete node at the beginning-----------------\n");


        pointer = deleteNodeAtBeginning(n1);
        while (pointer != null){
            System.out.print(pointer.value+" -> ");
            pointer = pointer.next;
        }
        System.out.print("null");

        System.out.println("\n\n------------------Delete node at the end-----------------\n");


        deleteNodeAtEnd(n1);
        pointer = n1;
        while (pointer != null){
            System.out.print(pointer.value+" -> ");
            pointer = pointer.next;
        }
        System.out.print("null");
    }

    public static Node addNodeAtBeginning(Node head,int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static  void addNodeAtEnd(Node head,int value){
        Node newNode = new Node(value);
        while (head.next != null){
            head = head.next;
        }
        head.next = newNode;
    }

    public static void addNodeAtSpecificPosition(Node head,int position, int value){
        Node newNode = new Node(value);
        for (int i = 1; i< position; i++){
            head = head.next;
        }
        newNode.next = head.next;
        head.next = newNode;
    }

    public static Node deleteNodeAtBeginning(Node head){
        if (head.next != null){
            return head.next;
        }
        return head;
    }

    public static void deleteNodeAtEnd(Node head){

        Node previous = null;
        while (head.next != null){
            previous = head;
            head = head.next;
        }
        previous.next = null;
    }
}
