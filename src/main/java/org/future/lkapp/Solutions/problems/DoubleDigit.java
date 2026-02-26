package org.future.lkapp.Solutions.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DoubleDigit {

    List<Integer> testarr = List.of(1, 1, 2, 2, 3, 3, 12);

    HashMap<Integer, Integer> map = new HashMap<>();
    String ssd = new String();

    public boolean doCalc(ArrayList<?> arr) {

        for (int i = 0; i < testarr.size(); i++) {
            // take an element
            Integer current = testarr.get(i);
            Integer count = map.getOrDefault(current, 0);
            map.put(current, ++count);
        }

        map.forEach((k, v) -> {
            System.out.println("k= " + k + " v= " + v);
        });

        return false;
    }

    // private boolean checkIfExist(int current) {
    //     for (int i = 0; i < testarr.size() - 1; i++) {
    //         if (testarr.get(i) == current) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
