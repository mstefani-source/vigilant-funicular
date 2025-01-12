package lkapp;

import lkapp.Solutions.addtwonumbers.ListNode;
import lkapp.Solutions.addtwonumbers.Solution2;
import lkapp.Solutions.lengthoflongestsubstring.*;
import lkapp.Solutions.reversewordsinastring.*;
import lkapp.Solutions.twosum.TwoSumHM;

public class lkapp {

    public static void main(String[] args) {

        ReverseWordsConsumers lk151 = new ReverseWordsConsumers();
        ReverseWordsByteArrayImputStream ba = new ReverseWordsByteArrayImputStream();
        ReverseWordsArray aos = new ReverseWordsArray();
        TwoSumHM tshm = new TwoSumHM(); 
        int[] nums = {3,3};

        // System.out.println(lk151.reverseWords("  end   of the day  "));
        // System.out.println(ba.reverseWords("  hello world   of java  "));
        // System.out.println(aos.reverseWords("  hello world of  haos  "));
        // int[] indexes = tshm.twoSum(nums, 6);

        // for (int i = 0; i < indexes.length; i++) {
        //     System.out.println(indexes[i]);
        // }

        DayOfWeek.findByLabel("Su");

        ListNode res;
        Solution2 sol2 = new Solution2();
        
        ListNode l1 = new ListNode(2);
        ListNode l1d2 = new ListNode(4);
        ListNode l1d1 = new ListNode(3);

        l1.next = l1d2;
        l1d2.next = l1d1;

        ListNode l2 = new ListNode(5);
        ListNode l2d2 = new ListNode(6);
        ListNode l2d1 = new ListNode(4);

        l2.next = l2d2;
        l2d2.next = l2d1;

        res = sol2.addTwoNumbers(l1, l2);

        // while (res != null){
        //     System.out.println("res: " + res.val);
        //     res = res.next;
        // }

        LongestSubString str = new LongestSubString();

        System.out.println("longest String: " + str.lengthOfLongestSubstring("pwwkew"));
        System.out.println("longest String: " + str.lengthOfLongestSubstring("bbbbbb"));
        System.out.println("longest String: " + str.lengthOfLongestSubstring("aab"));
        System.out.println("longest String: " + str.lengthOfLongestSubstring("dvdf"));
        System.out.println("longest String: " + str.lengthOfLongestSubstring("advsdw"));

    }
}
