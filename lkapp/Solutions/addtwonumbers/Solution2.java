package lkapp.Solutions.addtwonumbers;

public class Solution2 {

    int value1;
    int value2;
    int placenum;

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
            
            ListNode currentDigit = new ListNode();
            currentDigit.next = result;
            int sum = value1 + value2 + placenum;
            placenum = sum > 9 ? 1 : 0;
            currentDigit.val = sum % 10;
            System.out.println("sum: " + sum + " reminder " + placenum + " val = " + currentDigit.val);
            result = currentDigit;
            
        } while (l1 != null || l2 != null);
        result.val = placenum > 0 ? placenum: null;
        
        return result;
    }
}
