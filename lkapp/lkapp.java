package lkapp;

import lkapp.Solutions.addtwonumbers.ListNode;
import lkapp.Solutions.addtwonumbers.Solution2;
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

        ListNode res = new ListNode();
        Solution2 sol2 = new Solution2();
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(8);
        res = sol2.addTwoNumbers(l1, l2);

        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}
