package org.future.lkapp.Solutions.lru;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class LRUCache<K, V> {

    private final ReentrantLock lock = new ReentrantLock();
    private final int capacity;
    private Node<K, V> head;
    private Node<K, V> tail;

    ConcurrentHashMap<K, Node<K, V>> cache;

    public <K, V> LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new ConcurrentHashMap<>();
        this.head = null;
    }

    public V get(K key) {
        lock.lock();
        try {

            if (cache.containsKey(key)) {
                Node<K, V> node = cache.get(key);
                if (node == head) {
                    return node.value;
                }
                if (node == tail) {
                    tail.next = null;
                    tail = tail.prev;
                } else {
                    Node<K, V> previousNode = node.prev;
                    Node<K, V> nextNode = node.next;
                    previousNode.next = nextNode;
                    nextNode.prev = previousNode;
                }
                moveHead(node);
                return node.value;
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    public void put(K key, V value) {
        Node<K, V> node = new Node<K, V>(key, value);
        node.next = head;
        head.prev = node;
        head = node;
        if (cache.isEmpty()) {
            tail = node;
        }
        if (cache.size() == capacity) {
            K keyToDel = tail.key;
            cache.remove(keyToDel);
            tail = tail.prev;
            tail.next = null;
        }
        cache.put(key, node);
    }

    private void moveHead(Node<K, V> node) {
        node.next = head;
        head.prev = node;
        head = node;
        head.prev = null;
    }

    private class Node<K, V> {
        K key;
        V value;

        Node<K, V> next;
        Node<K, V> prev;

        Node(K key, V value) {
            this.next = null;
            this.prev = null;
        }
    }
}
