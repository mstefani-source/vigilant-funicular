package org.future.lkapp.Solutions.checkj;

import java.util.LinkedList;

public class CheckLambda<T extends Comparable<T>> {

    T max = null;

    LinkedList<T> stack = new LinkedList<>();

    public void push(T obj) {

        if (max == null || max.compareTo(obj) < 0)
            max = obj;
        stack.addFirst(obj);
    }

    public T pop() {
        T first = stack.pop();
        if (first.equals(max)) {
            max = findMax();
        }
        return first;
    }

    public T peekMax() {
        return max;
    }

    private T findMax() {
        if (stack == null || stack.isEmpty()) {
            return null;
        }

        // return stack.stream()
        // .max(Comparator.naturalOrder())
        // .orElse(null);

        for (T elem : stack) {
            if (elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }
}
