package org.future.lkapp.Solutions.sametree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    };

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public List<Integer> values() {

        ArrayList<Integer> result = new ArrayList<>();
        result.add(this.value);
        if (left != null) {
            result.addAll(left.values());
        }
        if (right != null) {
            result.addAll(right.values());
        }
        return result;
    }
}
