package org.future.lkapp.Solutions.balanced_binary_tree;

import org.future.lkapp.Solutions.sametree.TreeNode;

public class bbt {
    public boolean isBalanced(TreeNode root) {
        
        return false;
    }

    public void goDig(TreeNode node) {
        if (node == null) return;
        System.out.println(node.value);
        goDig(node.right);
        goDig(node.left);
    }

}
