package org.future.lkapp.Solutions.addtwonumbers;

import org.future.lkapp.Solutions.remnnode.NodeService;

public class Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode runner = result;
        int remainder;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            remainder = 0;
            runner.val = runner.val + l1.val + l2.val;

            if (runner.val > 9) {
                runner.val = runner.val - 10;
                remainder = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null && l2 == null) {
                if (remainder == 1) {
                    runner.next = new ListNode(1);
                }
                return result;
            } else {
                runner.next = new ListNode(remainder);
                runner = runner.next;
            }
        }
        return result;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode runner = result;
        ListNode l1_start = l1;
        ListNode l2_start = l2;
        ListNode inMemory = new ListNode();
        int reminder = 0;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                ListNode node = new ListNode();
                node.next = l1_start;
                l1_start = node;
            } else {
                l1 = l1.next;
            }

            if (l2 == null) {
                ListNode node = new ListNode();
                node.next = l2_start;
                l2_start = node;
            } else {
                l2 = l2.next;
            }
        }

        while (l1_start != null) {
            inMemory.val = l1_start.val + l2_start.val;
            if (l1_start.next != null) {
                runner = new ListNode();
                runner.next = inMemory;
                inMemory = runner;
            }
            l1_start = l1_start.next;
            l2_start = l2_start.next;
        }

        while (inMemory != null) {
            if (inMemory.val + reminder > 9) {
                result.val = inMemory.val + reminder - 10;
                reminder = 1;
            } else {
                result.val = inMemory.val + reminder;
                reminder = 0;
            }

            if (inMemory.next != null) {
                runner = new ListNode(0, result);
            } else {
                if (reminder == 1) runner = new ListNode(1, result);
            }
            result = runner;
            inMemory = inMemory.next;
        }
        return result;
    }

}
