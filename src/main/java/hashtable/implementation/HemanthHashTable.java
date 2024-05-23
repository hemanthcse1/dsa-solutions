package hashtable.implementation;

import java.util.Map;

public class HemanthHashTable<K,V> {

    private Bucket<K,V>[] buckets;
    private int capacity;

    public HemanthHashTable(int capacity){
        this.capacity = capacity;
        buckets = new Bucket[capacity];
        for (int i = 0; i< capacity; i++){
            buckets[i] = new Bucket<>();
        }
    }

    private int getIndex(K key){
        return Math.abs(key.hashCode() % capacity);
    }

    public V  get(K key){
        int index = getIndex(key);
        return buckets[index].get(key);
    }

    public void put(K key, V value){
        int index = getIndex(key);
        buckets[index].put(key,value);
    }

    public boolean remove(K key){
        int index = getIndex(key);
        return buckets[index].remove(key);
    }

    public static void main(String[] args){
        HemanthHashTable<String,Integer> table = new HemanthHashTable<>(10);

        table.put("One",1);
        table.put("Two",2);
        table.put("Three",3);
        table.put("Four",4);

        System.out.println(" get one -> "+table.get("One"));

        table.put("One", 11);

        System.out.println(" get one -> "+table.get("One"));

        table.remove("One");
        System.out.println(" get one -> "+table.get("One"));

    }


}
