package lkapp.Solutions.twosum;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TwoSumHM {

    int numberToFind;
    
    public TwoSumHM() {
        
    }
    public int[] twoSum (int[] nums, int target) {
        
        int[] result = {0,0};
        HashMap <Integer, LinkedList<Integer>> valuesMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (valuesMap.get(nums[i]) == null) {
                valuesMap.put(nums[i], new LinkedList<>());
            } 
            valuesMap.get(nums[i]).add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            numberToFind = target - nums[i];
            List<Integer> index = valuesMap.get(numberToFind);
            if (index != null && index.get(0) != i) {
                result[0] = i;
                result[1] = index.remove(0);
                break;
            }
        }

        return result;
    }   
}
