package org.future.lkapp.Solutions.sberquestion;

import java.util.List;
import java.util.NoSuchElementException;

public class Digits<T extends Comparable<T>> {

    public T max(List<T> list) {
        return list.stream().max(T::compareTo).orElseThrow(() -> new NoSuchElementException());
    }

}
