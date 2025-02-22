package org.future.lkapp.Solutions.sametree;

import java.util.Objects;

/**
 * 
 */

public class SameTreeSolution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        int index = 0;

        if (p.values().size() != q.values().size()) {
            return false;
        }

        while (index < p.values().size() ) {
            if (Objects.equals(p.values().get(index), p.values().get(index))){
                return false;
            }
            index++;
        }

        return true;
    }

}
