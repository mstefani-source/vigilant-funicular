package org.future.lkapp.solutions.remnnode;

import java.util.ArrayList;

import org.future.lkapp.solutions.addtwonumbers.ListNode;

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
