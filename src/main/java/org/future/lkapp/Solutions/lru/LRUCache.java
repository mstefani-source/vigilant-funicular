package org.future.lkapp.Solutions.lru;

import java.util.HashMap;

class LRUCache {

    private final int capacity; 
    HashMap <Integer, Node<Integer, Integer>> cache = new HashMap<>();
    Node <Integer, Integer> first;
    Node <Integer, Integer> last;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            first = cache.get(key);
            return (int) first.value;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        Node <Integer, Integer> toAdd = new Node<>(key, value);
        if (cache.size() == 0) {
            first = toAdd;
            last = toAdd;
            cache.put(key, first);
            return;
        }

        toAdd.next = first;
        first.prev = toAdd;
        first = toAdd;

        if (cache.size() < capacity) {
            cache.put(key, first);
        } else {
            cache.remove(last.key);
            if (last.prev != null){
              last = last.prev;
            }
            last.next = null;
            cache.put(key, first);
        }
    }

    private static class Node <K, V> {

        K key;
        V value;
        Node <K, V> next;
        Node <K, V> prev;

        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}

