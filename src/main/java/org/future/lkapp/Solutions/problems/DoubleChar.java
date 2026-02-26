package org.future.lkapp.Solutions.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoubleChar {

    // Input: [A, B, A, B, A, B, C, C, D, C, C]
    // Output: [A, B, A, B, C, C, D]
    /* ============================================ */

    public List<String> calcEntrys(List<String> list) {
        List<String> out = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        list.forEach(
                (el) -> {
                    Integer currentCount = map.getOrDefault(el, 0);
                    
                    if (currentCount < 2)
                        map.put(el, currentCount + 1);
                });

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        return out;
    }

    public static void main(String[] args) {

        List<String> listStr = List.of("A", "B", "A", "B", "A", "B", "C", "C", "D", "C", "C");
        DoubleChar dch = new DoubleChar();
        dch.calcEntrys(listStr);
    }

}
