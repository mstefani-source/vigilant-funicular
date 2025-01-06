package lkapp.Solutions.addtwonumbers;

public class Solution2 {

    int value1;
    int value2;
    int placenum;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode finalResult = result;

        do {
            if (l1 == null) {
                value1 = 0;
            } else {
                value1 = l1.val;
                l1 = l1.next;
            }
            if (l2 == null) {
                value2 = 0;
            } else {
                value2 = l2.val;
                l2 = l2.next;
            }

            int sum = value1 + value2 + placenum;
            placenum = sum > 9 ? 1 : 0;
            result.val = sum % 10;

            if (l1 != null || l2 != null) {
                result.next = new ListNode();
                result = result.next;
            }

        } while (l1 != null || l2 != null);

        if (placenum > 0) {
            result.next = new ListNode(placenum);
        }

        return finalResult;
    }
}
