package linkedlist.removeduplicatesfromdll;

public class DLLMain {

    public static void main(String[] args){

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(4);
        dll.append(4);
        dll.append(3);
        dll.append(2);
        dll.append(2);
        dll.append(1);

        System.out.println("Original List:");
        dll.printList();

        dll.removeDuplicates();

        System.out.println("List after removing duplicates:");
        dll.printList();

    }
}
