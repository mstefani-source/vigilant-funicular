package org.future.lkapp.Solutions.lru;

public class CustomQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;
    private Object lock = new Object();

    public void addLast(T value) {
        synchronized (lock) {
            Node<T> toAdd = new Node<T>(value);
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

    public void addFirst(T value) {
        synchronized (lock) {
            Node<T> toAdd = new Node<T>(value);
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

        Node<T> toRemove = tail;
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

        Node<T> toRemove = head;
        head = head.next;
        head.prev = null;
        toRemove.next = null;
        size--;
    }

    public void remove(T value) {
        if (this.isEmpty()) {
            return;
        }

        Node<T> pointer = head;

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

    private void doRemoveLogic(Node<T> toRemove) {
        if (toRemove == head) {
            removeFirst();
        } else if (toRemove == tail) {
            removeLast();
        } else {
            Node<T> prevNode = toRemove.prev;
            Node<T> nextNode = toRemove.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            toRemove.next = null;
            toRemove.prev = null;
            size--;
        }
    }

    private class Node<T> {
        T value;

        Node<T> next;
        Node<T> prev;

        Node(T value) {
            this.value = value;
        }
    }
}
