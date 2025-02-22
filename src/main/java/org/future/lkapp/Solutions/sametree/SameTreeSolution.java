package org.future.lkapp.Solutions.sametree;

import java.util.Objects;

/**
 * 
 */

public class SameTreeSolution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        int index = 0;

        if (p.left != null && q.left != null && p.left.value == q.left.value) {
            isSameTree(p.left, q.left);
        } else if (p.left == null && q.left == null){
            return true;
        }

        if (p.right != null && q.right != null && p.right.value == q.right.value) {
            isSameTree(p.right, q.right);
        } else if (p.right == null && q.right == null){
            return true;
        }

        return false;
    }

}
