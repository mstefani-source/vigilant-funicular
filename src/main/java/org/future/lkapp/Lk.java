package org.future.lkapp;

import org.future.lkapp.Solutions.addtwonumbers.ListNode;
<<<<<<< Updated upstream
import org.future.lkapp.Solutions.balanced_binary_tree.Bbt;
import org.future.lkapp.Solutions.balanced_binary_tree.bbt;
=======
import org.future.lkapp.Solutions.addtwonumbers.Numbers;
>>>>>>> Stashed changes
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

        // Create a sample tree:
        //         1
        //        / \
        //       2   2
        //      / \
        //     3   3
        //    / \
        //   4   4

        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(3, 
                            new TreeNode(4), 
                            new TreeNode(4))
                        ),
                new TreeNode(2));


        Bbt bbt = new Bbt();

        bbt.goDig(root);
        System.out.println("counter " + bbt.getRightCounter());

        // TreeNode p =
        // new TreeNode(1, new TreeNode(2), new TreeNode(3));
        // TreeNode q =
        // new TreeNode(1, new TreeNode(2), new TreeNode(3));

        // SameTreeSolution sts = new SameTreeSolution();
        // System.out.println(sts.isSameTree(p, q));

        // ReverseWordsConsumers lk151 = new ReverseWordsConsumers();
        // ReverseWordsByteArrayImputStream ba = new ReverseWordsByteArrayImputStream();
        // ReverseWordsArray aos = new ReverseWordsArray();
        // TwoSumHM tshm = new TwoSumHM();
        // int[] nums = { 3, 3 };

        // DayOfWeek.findByLabel("Su");

<<<<<<< Updated upstream
        // ListNode l1 = new ListNode(1);
        // ListNode l2 = new ListNode(2);
        // ListNode l3 = new ListNode(3);
        // ListNode l4 = new ListNode(4);

        // l1.next = l2;
        // l2.next = l3;
        // l3.next = l4;

        // Remnnode rn = new Remnnode();
        // NodeService ns = new NodeService();

        // System.out.println(ns.printNode(l1));
        // System.out.println(ns.printNode(rn.removeNthFromEnd(l1, 2)));
=======
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);

        b1.next = b2;
        b2.next = b3;

        ListNode f1 = new ListNode(1);
        ListNode f2 = new ListNode(9,new ListNode(9));



        // Remnnode rn = new Remnnode();
        NodeService ns = new NodeService();
        // System.out.println(ns.printNode(l1));

        // System.out.println(ns.printNode(rn.removeNthFromEnd(l1, 2)));

        Numbers numbers = new Numbers();

        System.out.println("result " + ns.printNode(numbers.addTwoNumbers2(f1, f2)));
>>>>>>> Stashed changes

    }
}
