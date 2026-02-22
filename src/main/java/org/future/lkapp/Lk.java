package org.future.lkapp;

import java.util.List;

import org.future.lkapp.Solutions.sberquestion.Binery;

/**
 *
 * @author mstefani
 */
public class Lk {

    // static int LOOP = 100;
    public static void main(String[] args) {

        List<Integer> arr = List.of(1,2,3,4,5,6,6,7,7,8,9,9,10);

        Binery binery = new Binery();

        int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr2 = {1, 7, 8, 9, 98};
        int [] arr3 = {1, 100};
        int [] arr4 = {1};

        // System.out.println("find 8 " + binery.search(arr1, 1));
        // System.out.println("find 8 " + binery.search(arr2, 7));
        System.out.println("find 8 " + binery.search(arr3, 1));
        System.out.println("find 8 " + binery.search(arr4, 5));

        // LuckyTicket lt = new LuckyTicket();
        // System.out.println(lt.check("123423"));
        // ABCcalc abc = new ABCcalc();
        // System.out.println(abc.calcword("HelloJava45"));
        // List<Integer> al = List.of(1,1,2,2,3,4,3,5,7,5,7);
        // SberQuestion sq = new SberQuestion(al);
        // System.out.println(sq.findUnique());
        
        // VkProblem vk = new VkProblem();
        // System.out.println(vk.convertUrl("Hello Java  "));

        // Create a sample tree:
        //         1
        //        / \
        //       2   2
        //      / \
        //     3   3
        //    / \
        //   4   4

        // TreeNode root = new TreeNode(1,
        //         new TreeNode(2,
        //                 new TreeNode(3),
        //                 new TreeNode(3, 
        //                     new TreeNode(4), 
        //                     new TreeNode(4))
        //                 ),
        //         new TreeNode(2));


        // Bbt bbt = new Bbt();

        // bbt.goDig(root);
        // System.out.println("counter " + bbt.getRightCounter());

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

        // ListNode l1 = new ListNode(7);
        // ListNode l2 = new ListNode(2);
        // ListNode l3 = new ListNode(4);
        // ListNode l4 = new ListNode(3);

        // l1.next = l2;
        // l2.next = l3;
        // l3.next = l4;

        // ListNode b1 = new ListNode(5);
        // ListNode b2 = new ListNode(6);
        // ListNode b3 = new ListNode(4);

        // b1.next = b2;
        // b2.next = b3;

        // ListNode f1 = new ListNode(1);
        // ListNode f2 = new ListNode(9,new ListNode(9));



        // // Remnnode rn = new Remnnode();
        // NodeService ns = new NodeService();
        // // System.out.println(ns.printNode(l1));

        // // System.out.println(ns.printNode(rn.removeNthFromEnd(l1, 2)));

        // Numbers numbers = new Numbers();

        // System.out.println("result " + ns.printNode(numbers.addTwoNumbers2(f1, f2)));

    }
}
