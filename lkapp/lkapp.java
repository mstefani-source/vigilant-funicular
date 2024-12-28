package lkapp;

import lkapp.Solutions.reversewordsinastring.*;
import lkapp.Solutions.twosum.TwoSumHM;

public class lkapp {

    public static void main(String[] args) {

        ReverseWordsConsumers lk151 = new ReverseWordsConsumers();
        ReverseWordsByteArrayImputStream ba = new ReverseWordsByteArrayImputStream();
        ReverseWordsArray aos = new ReverseWordsArray();
        TwoSumHM tshm = new TwoSumHM(); 
        int[] nums = {3,3};

        System.out.println(lk151.reverseWords("  end   of the day  "));
        System.out.println(ba.reverseWords("  hello world   of java  "));
        System.out.println(aos.reverseWords("  hello world of  aos  "));
        int[] indexes = tshm.twoSum(nums, 6);

        for (int i = 0; i < indexes.length; i++) {
            System.out.println(indexes[i]);
        }
        
    }
}
