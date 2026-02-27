package org.future.lkapp.Solutions.sberquestion;

public class BineryT {
    public boolean search(int[] arr, int lostNum) {

        int leftIndex = 0;
        int rightIndex = arr.length;

        while (leftIndex < rightIndex) {
            int middle = (rightIndex - leftIndex) / 2;
            if (arr[middle] == lostNum)
                return true;
            if (arr[middle] > lostNum) {
                rightIndex = middle;
            } else {
                leftIndex = middle + 1;
            }
        }

        return false;
    }
}
