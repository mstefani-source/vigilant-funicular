package lkapp;

import lkapp.Solutions.palindrome.IntegerPalindrome;
import lkapp.Solutions.palindrome.Palindrome;

public class lkapp {

    public static void main(String[] args) {

        // Median med = new Median();
        // ReverseWordsConsumers lk151 = new ReverseWordsConsumers();
        // ReverseWordsByteArrayImputStream ba = new ReverseWordsByteArrayImputStream();
        // ReverseWordsArray aos = new ReverseWordsArray();
        // TwoSumHM tshm = new TwoSumHM(); 
        // int[] nums = {3,3};

        Palindrome pl = new Palindrome();
        System.out.println(pl.isPalindrome("121"));

        IntegerPalindrome iPl = new IntegerPalindrome();
        System.out.println("->" + iPl.isPalindrome(121));
        

        // System.out.println(lk151.reverseWords("  end   of the day  "));
        // System.out.println(ba.reverseWords("  hello world   of java  "));
        // System.out.println(aos.reverseWords("  hello world of  haos  "));
        // int[] indexes = tshm.twoSum(nums, 6);

        // for (int i = 0; i < indexes.length; i++) {
        //     System.out.println(indexes[i]);
        // }

        // 1,2,3,4,5,6
        //     3,4,5,6,7,8,9

        // 1.2.3.3.4.4.5.5.6. 6.7. 8. 9

        // 1,2,3,4,5,6,7,8,9,10,11,12,13 
        //             x
        // 1.2.3.4.5.6.7.8.9
        //         x


        // int[] nums1 = {1,2,3,4,5,6};
        // int[] nums2 = {3,4,5,6,7,8,9};

        // med.findMedianSortedArrays(nums1, nums2);
        
        

        // ListNode res;
        // Solution2 sol2 = new Solution2();
        
        // ListNode l1 = new ListNode(2);
        // ListNode l1d2 = new ListNode(4);
        // ListNode l1d1 = new ListNode(3);

        // l1.next = l1d2;
        // l1d2.next = l1d1;

        // ListNode l2 = new ListNode(5);
        // ListNode l2d2 = new ListNode(6);
        // ListNode l2d1 = new ListNode(4);

        // l2.next = l2d2;
        // l2d2.next = l2d1;

        // res = sol2.addTwoNumbers(l1, l2);

        // while (res != null){
        //     System.out.println("res: " + res.val);
        //     res = res.next;
        // }

    }
}
