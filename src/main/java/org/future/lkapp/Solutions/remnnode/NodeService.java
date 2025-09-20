package org.future.lkapp.Solutions.remnnode;

import java.util.ArrayList;

import org.future.lkapp.Solutions.addtwonumbers.ListNode;

public class NodeService {
        public ArrayList<Integer> printNode (ListNode listNode){
        ArrayList<Integer> res = new ArrayList<>();
        while (listNode != null) {
            res.add(listNode.val);
            listNode = listNode.next;
        }
        return res;
    }
}
