package org.future.lkapp.Solutions.sberquestion;

// дан массив <Integer> sorted 
// find digit

public class Binery {

    public boolean search(int[] arr, Integer searchNum) {

        int lowerBound = 0;
        int upperBound = arr.length;

        while (lowerBound < upperBound) {
            int middle = (lowerBound + upperBound) / 2;

            if (arr[middle] == searchNum) {
                return true;
            }
            if (arr[middle] < searchNum) {
                lowerBound = middle + 1;
            } else {
                upperBound = middle;
            }
        }
        return false;
    }
}
