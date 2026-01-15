package org.future.lkapp.Solutions.sberquestion;

import java.util.HashMap;
import java.util.List;

public class SberQuestion {

    public boolean findUniqueFast(List<Integer> lst) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < lst.size(); i++) {
            Integer current = lst.get(i);
            if (hm.get(current) == null) {
                hm.put(current, 1);
            } else {
                hm.put(current, hm.get(current) + 1);
            }
        }
        return hm.containsValue(1);
    }
}
