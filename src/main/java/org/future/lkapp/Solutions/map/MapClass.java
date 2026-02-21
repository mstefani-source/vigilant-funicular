package org.future.lkapp.Solutions.map;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    HashMap<String, Integer> scores = (HashMap<String, Integer>) Map.of("player1", 23, "player2", 21, "player3", 12);

    public void showEntries() {

        scores.forEach((k, v) -> {
            System.out.print(k + ":" + v);
        });
    }

    public void showEntriess() {

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
        }
    }

}
