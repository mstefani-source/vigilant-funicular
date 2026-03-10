package org.future.lkapp.Solutions.sberquestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SberQuestion {

    public boolean findUniqueBySet(List<Integer> list) {

        Set<Integer> setUnique = new HashSet<>();
        Map<Integer, Boolean> map = new HashMap<>();

        list.forEach((el) -> {
            map.put(el, setUnique.add(el));
        });

        return map.containsValue(true);
    }
}
