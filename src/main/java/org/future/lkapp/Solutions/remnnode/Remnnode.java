package org.future.lkapp.Solutions.remnnode;

import org.future.lkapp.Solutions.addtwonumbers.ListNode;

public class Remnnode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            head = null;
            return head;
        }

        ListNode ptr = new ListNode();
        ListNode chainToChange = new ListNode();

        ptr = head;
        chainToChange = head;
        int counter = 0;

        while (ptr.next != null) {

            if (counter < n) {
                counter++;
            } else {
                chainToChange = chainToChange.next;
            }

            ptr = ptr.next;
        }

        if (counter < n) {
            head = head.next;
        } else {
            chainToChange.next = chainToChange.next.next;
        }
        return head;
    }

}
