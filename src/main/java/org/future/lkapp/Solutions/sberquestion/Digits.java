package org.future.lkapp.Solutions.sberquestion;

import java.util.List;

public class Digits <T extends Comparable<T>> {
    
    public T max(List<T> arr) {
        
        return arr.stream().max(T::compareTo).orElseGet(null);
    }

}
