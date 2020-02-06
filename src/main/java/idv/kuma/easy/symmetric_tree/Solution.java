package idv.kuma.easy.symmetric_tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return areSymmetric(root.left, root.right);


    }


    private boolean areSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return areSymmetric(left.left, right.right)
                && areSymmetric(left.right, right.left);
    }
}

class IntrativeSolution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        List<TreeNode> list = new ArrayList<>();

        list.add(root.left);
        list.add(root.right);


        while (list.size() > 0) {

            TreeNode left = list.remove(0);
            TreeNode right = list.remove(0);

            if (left == null && right == null) {
                continue;
            }

            if (left == null || right == null) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }

            list.add(left.left);
            list.add(right.right);

            list.add(left.right);
            list.add(right.left);

        }

        return true;

    }
}