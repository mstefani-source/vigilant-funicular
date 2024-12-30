package lkapp.Solutions.addtwonumbers;

public class Solution2 {

    int value1;
    int value2;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        do {
            // if (l1 == null) {
            //     value1 = 0;
            // } else {
            //     value1 = l1.val;
            //     l1 = l1.next;
            // }
            // if (l2 == null) {
            //     value2 = 0;
            // } else {
            //     value2 = l2.val;
            //     l2 = l2.next;
            // }

            value1 = l1 == null ? 0 : l1.val;
            value2 = l2 == null ? 0 : l2.val;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;


            System.out.println("l1.next: " + value1 + " l2.next: " + value2);
        } while (l1 != null || l2 != null);
        return result;
    }
}
