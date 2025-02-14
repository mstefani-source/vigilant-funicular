package org.future.lkapp;


import java.util.Map;

import org.future.lkapp.Solutions.reversewordsinastring.*;
import org.future.lkapp.Solutions.twosum.*;
import org.future.lkapp.Solutions.addtwonumbers.*;
import org.future.lkapp.Solutions.lengthoflongestsubstring.*;
import org.future.lkapp.Solutions.zigzag.*;

/**
 *
 * @author mstefani
 */
public class Lk {

    public static void main(String[] args) {
        ReverseWordsConsumers lk151 = new ReverseWordsConsumers();
        ReverseWordsByteArrayImputStream ba = new ReverseWordsByteArrayImputStream();
        ReverseWordsArray aos = new ReverseWordsArray();
        TwoSumHM tshm = new TwoSumHM();
        int[] nums = { 3, 3 };

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

        LongestSubString str = new LongestSubString();

        System.out.println("longest String: " + str.lengthOfLongestSubstring("pwwkew"));
        System.out.println("longest String: " + str.lengthOfLongestSubstring("bbbbbb"));
        System.out.println("longest String: " + str.lengthOfLongestSubstring("aab"));
        System.out.println("longest String: " + str.lengthOfLongestSubstring("dvdf"));
        System.out.println("longest String: " + str.lengthOfLongestSubstring("advsdw"));

        ZigZag zig = new ZigZag();
        Map<Integer, String> testcases = Map.of(
                1, "{'PAYPALISHIRING', 3}",
                2, "{'PAYPALISHIRING', 4}",
                3, "{'A', 3}",
                4, "{'PAYP', 4}");

        ZigZag zigZag = new ZigZag();

        System.out.print("waiting for PAHNAPLSIIGYIR got ");
        System.out.println(zigZag.convert("PAYPALISHIRING", 3) + " "
                + zigZag.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR"));
        System.out.print("waiting for PINALSIGYAHRPI got ");
        System.out.println(zigZag.convert("PAYPALISHIRING", 4) + " "
                + zigZag.convert("PAYPALISHIRING", 4).equals("PINALSIGYAHRPI"));
        System.out.println(zigZag.convert("PAYP", 2) + " " + zigZag.convert("PAYP", 2).equals("PYAP"));
        System.out.println(zigZag.convert("PAY", 2) + " " + zigZag.convert("PAY", 2).equals("PYA"));
        System.out.println(
                zigZag.convert("PAYPAL", 2) + " <-> " + "PYAAPL " + zigZag.convert("PAYPAL", 2).equals("PYAAPL"));
        System.out.println(
                zigZag.convert("PAYPAL", 3) + " <-> " + "PAAPLY " + zigZag.convert("PAYPAL", 3).equals("PAAPLY"));
    }

}
