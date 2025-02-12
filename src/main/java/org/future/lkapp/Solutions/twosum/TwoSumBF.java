package org.future.lkapp.Solutions.twosum;

/* * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * */

public class TwoSumBF {
    public int[] twoSum (int[] nums, int target) {
        int[] result = {0, 0};
        int numToFind = 0;
        for (int i = 0; i < nums.length; i++) {
            numToFind = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == numToFind) {
                    result[0] = i;
                    result[1] = j;
                    i = j = nums.length;
                }
            }
        }
        return result;
    }
}
