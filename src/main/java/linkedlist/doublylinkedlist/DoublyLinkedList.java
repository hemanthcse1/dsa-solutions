package linkedlist.doublylinkedlist;

public class DoublyLinkedList {

    public static void main(String[] args){

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);



        n1.previous = null;
        n1.next = n2;

        n2.previous = n1;
        n2.next = n3;

        n3.previous = n2;
        n3.next = n4;

        n4.previous = n3;
        n4.next = n5;

        n5.previous = n4;
        n5.next = null;


        Node fptr = n1;
        System.out.print(" null <- ");
        while (fptr != null){
            System.out.print(fptr.val +" -> ");
            fptr = fptr.next;
        }
        System.out.print(" null ");


        System.out.println("\n\n---------------------------------\n\n");
        Node bptr = n5;
        System.out.print(" null ");
        while (bptr != null){
            System.out.print(" <-  "+bptr.val);
            bptr = bptr.previous;
        }
        System.out.print(" null ");


        System.out.println("\n\n------------------Insert Node at beginning---------------\n\n");
        Node newNode = insertNodeAtBeginning(11,n1);

        System.out.print(" null <- ");
        while (newNode != null){
            System.out.print(newNode.val +" -> ");
            newNode = newNode.next;
        }
        System.out.print(" null ");


        System.out.println("\n\n------------------Insert Node at end---------------\n\n");
        insertNodeAtEnd(55,n1);

        Node ptr = n1;
        System.out.print(" null <- ");
        while (ptr != null){
            System.out.print(ptr.val +" -> ");
            ptr = ptr.next;
        }
        System.out.print(" null ");

    }

    public static Node insertNodeAtBeginning(int value, Node head){
        Node newNode = new Node(value);
        if (head == null){
            return newNode;
        }

        newNode.next = head;
        newNode.previous = null;

        head = newNode;
        return head;
    }

    public static void insertNodeAtEnd(int value, Node head){

        Node newNode = new Node(value);
        if (head == null){
            return;
        }

        while (head.next != null){
            head = head.next;
        }

        head.next = newNode;
        newNode.previous = head;
    }
}
