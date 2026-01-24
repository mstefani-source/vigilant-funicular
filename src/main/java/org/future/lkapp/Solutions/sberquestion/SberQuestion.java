package org.future.lkapp.Solutions.sberquestion;

import java.util.List;

public class SberQuestion {

    private final List<Integer> arr;

    public SberQuestion(List<Integer> al) {
        this.arr = al;
    }

    public boolean findUnique() {

        for (int i = 0; i < arr.size(); i++) {
            if (unique(i)) {
                return true;
            }
        }

        return false;
    }

    private boolean unique(int digit) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (i == digit) {
                count++;
            }
        }
        if (count > 1) {
            return false;
        } else {
            return true;
        }
    }


}
