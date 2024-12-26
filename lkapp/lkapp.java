package lkapp;

import java.util.Arrays;

import lkapp.Solutions.twosum.TwoSumHM;

// import lkapp.Solutions.lk151.Consumers;
// import lkapp.Solutions.lk151.ByteArray;
// import lkapp.Solutions.lk151.ArrayOfString;

public class lkapp {

    public static void main(String[] args) {

        // Consumers lk151 = new Consumers();
        // ByteArray ba = new ByteArray();
        // ArrayOfString aos = new ArrayOfString(); 
        TwoSumHM tshm = new TwoSumHM(); 
        int[] nums = {3,3};

        // System.out.println(lk151.reverseWords("  end   of the day  "));
        // System.out.println(ba.reverseWords("  hello world   of java  "));
        // System.out.println(aos.reverseWords("  hello world of  aos  "));
        int[] indexes = tshm.twoSum(nums, 6);

        for (int i = 0; i < indexes.length; i++) {
            System.out.println(indexes[i]);
        }
        
    }
}
