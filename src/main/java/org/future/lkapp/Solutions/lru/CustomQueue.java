package org.future.lkapp.Solutions.lru;

public class CustomQueue<K, V> {

    private static class Node<I, J> {
        I key;
        J value;

        Node<I, J> next;
        Node<I, J> prev;

        Node(I key, J value) {
            this.value = value;
            this.key = key;
        }
    }

    private Node<K, V> head;
    private Node<K, V> tail;
    private int size;
    private Object lock = new Object();

    public void addLast(K key, V value) {
        synchronized (lock) {
            Node<K, V> toAdd = new Node<K, V>(key, value);
            toAdd.prev = tail;
            if (tail != null) {
                tail.next = toAdd;
            }
            tail = toAdd;
            if (head == null) {
                head = toAdd;
            }
            size++;
        }
    }

    public void addFirst(K key, V value) {
        synchronized (lock) {
            Node<K, V> toAdd = new Node<K, V>(key, value);
            if (head != null) {
                toAdd.next = head;
                head.prev = toAdd;
            }
            head = toAdd;
            if (tail == null) {
                tail = toAdd;
            }
            size++;
        }
    }

    public void removeLast() {

        if (this.isEmpty()) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node<K, V> toRemove = tail;
        tail = tail.prev;

        tail.next = null;
        toRemove.prev = null;
        size--;
    }

    public void removeFirst() {

        if (this.isEmpty()) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node<K, V> toRemove = head;
        head = head.next;
        head.prev = null;
        toRemove.next = null;
        size--;
    }

    public void remove(K key, V value) {
        if (this.isEmpty()) {
            return;
        }

        Node<K, V> pointer = head;

        while (pointer.next != null) {
            if (value == pointer.value) {
                doRemoveLogic(pointer);
            }
            pointer = pointer.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void doRemoveLogic(Node<K, V> toRemove) {
        if (toRemove == head) {
            removeFirst();
        } else if (toRemove == tail) {
            removeLast();
        } else {
            Node<K, V> prevNode = toRemove.prev;
            Node<K, V> nextNode = toRemove.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            toRemove.next = null;
            toRemove.prev = null;
            size--;
        }
    }

}
