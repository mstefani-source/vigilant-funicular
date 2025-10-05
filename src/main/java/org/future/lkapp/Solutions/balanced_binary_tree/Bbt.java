package org.future.lkapp.Solutions.balanced_binary_tree;

import org.future.lkapp.Solutions.sametree.TreeNode;

public class Bbt {

    private int right_counter;
    private int left_counter; 

    public boolean isBalanced(TreeNode root) {
        goDig(root);
        return false;
    }

    public void goDig(TreeNode node) {
        if (node == null)
            return;
        System.out.println(node.value);
        goDig(node.right);
        goDig(node.left);
        right_counter++;
    }

    public int getRightCounter(){
        return right_counter;
    }

}
