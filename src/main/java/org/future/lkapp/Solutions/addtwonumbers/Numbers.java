package org.future.lkapp.Solutions.addtwonumbers;

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
                runner.val = runner.val -10;
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

}
