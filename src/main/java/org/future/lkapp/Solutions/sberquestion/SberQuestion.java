package org.future.lkapp.Solutions.sberquestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SberQuestion {

    public boolean findUniqueBySet(List<Integer> list) {
        Set<Integer> uSet = new HashSet<>();
        Map<Integer, Boolean> uMap = new HashMap<>();

        list.forEach((el)->{
            uMap.put(el, uSet.add(el));
        });

        return uMap.containsValue(true);
    }
}
