package org.future.lkapp;

import org.future.lkapp.Solutions.addtwonumbers.ListNode;
import org.future.lkapp.Solutions.remnnode.NodeService;
import org.future.lkapp.Solutions.remnnode.Remnnode;
import org.future.lkapp.Solutions.sametree.SameTreeSolution;
import org.future.lkapp.Solutions.sametree.TreeNode;

/**
 *
 * @author mstefani
 */
public class Lk {

    // static int LOOP = 100;
    public static void main(String[] args) {



        // TreeNode p = 
        //     new TreeNode(1, new TreeNode(2), new TreeNode(3));        
        // TreeNode q = 
        //     new TreeNode(1, new TreeNode(2), new TreeNode(3));

        // SameTreeSolution sts = new SameTreeSolution();
        // System.out.println(sts.isSameTree(p, q));

        // ReverseWordsConsumers lk151 = new ReverseWordsConsumers();
        // ReverseWordsByteArrayImputStream ba = new ReverseWordsByteArrayImputStream();
        // ReverseWordsArray aos = new ReverseWordsArray();
        // TwoSumHM tshm = new TwoSumHM();
        // int[] nums = { 3, 3 };

        // DayOfWeek.findByLabel("Su");

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        // ListNode l3 = new ListNode(3);
        // ListNode l4 = new ListNode(4);

        l1.next = l2;
        // l2.next = l3;
        // l3.next = l4;
        
        Remnnode rn = new Remnnode();
        NodeService ns = new NodeService();
        System.out.println(ns.printNode(l1));

        System.out.println(ns.printNode(rn.removeNthFromEnd(l1, 2)));


    }
}
