package com.adrianwieczorek.javaalgorithmsvisualizer.structures;

import com.adrianwieczorek.javaalgorithmsvisualizer.core.Entry;

public class MyHashMap {
    Entry[] bucket = new Entry[16];

    public void put(Object key, Object value) {
        int hash = key.hashCode();

        int index = Math.abs(hash) % bucket.length;

        Entry current = bucket[index];

        if (current == null) {
            new Entry(key,value);
            bucket[index] =  new Entry(key,value);
        }
        while (current != null) {
            if (current.key.equals(key)){
                current.value =  value;
                return;
            }
                if(current.next == null){
                    current.next = new Entry(key,value);
                    return;
                }
                current = current.next;
            }
        }
    public Object get(Object key) {
        int hash = key.hashCode();
        int index = Math.abs(hash) % bucket.length;
        Entry current = bucket[index];
        while (current != null) {
            if (current.key.equals(key)){
                return current.value;
            }else current=current.next;
        }
        return null;
    }
}

