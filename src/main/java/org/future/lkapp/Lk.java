package org.future.lkapp;

import org.future.lkapp.Solutions.sametree.SameTreeSolution;
import org.future.lkapp.Solutions.sametree.TreeNode;

/**
 *
 * @author mstefani
 */
public class Lk {

    // static int LOOP = 100;
    public static void main(String[] args) {

        TreeNode p = 
            new TreeNode(1, new TreeNode(2), new TreeNode(3) );        
        TreeNode q = 
            new TreeNode(1, new TreeNode(2), new TreeNode(3));

        SameTreeSolution sts = new SameTreeSolution();
        System.out.println(sts.isSameTree(p, q));

        // ReverseWordsConsumers lk151 = new ReverseWordsConsumers();
        // ReverseWordsByteArrayImputStream ba = new ReverseWordsByteArrayImputStream();
        // ReverseWordsArray aos = new ReverseWordsArray();
        // TwoSumHM tshm = new TwoSumHM();
        // int[] nums = { 3, 3 };

        // DayOfWeek.findByLabel("Su");

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

    }
}
