package org.future.lkapp.Solutions.sberproblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class ArrayUtils<T extends Comparable<T>> {

    public boolean haveUnique(ArrayList<T> arr) {
        Set<T> seenOnce = new HashSet<>();
        Set<T> seenMultiple = new HashSet<>();

        for (T element : arr) {
            if (seenMultiple.contains(element)) {
                continue;
            }

            if (seenOnce.contains(element)) {
                seenOnce.remove(element);
                seenMultiple.add(element);
            } else {
                seenOnce.add(element);
            }
        }
        return !seenOnce.isEmpty();
    }
}