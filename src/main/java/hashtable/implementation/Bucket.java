package hashtable.implementation;

public class Bucket<K, V> {
    private Node<K,V> head;

    public V get(K key){
        Node<K,V> current = head;
        while (current != null){
            if (current.key.equals(key)){
                return current.value;
            }
            current =current.next;
        }
        return null;
    }

    public void put(K key, V value){
        Node<K,V> current = head;
        while (current != null){
            if (current.key.equals(key)){
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node<K,V> newNode = new Node<>(key, value);
        newNode.next = head;
        head = newNode;
    }

    public boolean remove(K key){
        Node<K, V> current = head;
        Node<K,V> prev = null;
        while (current != null){
            if (current.key.equals(key)){
                if (prev != null){
                    prev.next = current.next;
                }else {
                    head  = current.next;
                }
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public Node<K,V> getHead(){
        return head;
    }
}
