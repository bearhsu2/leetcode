package idv.kuma.easy.validate_binary_search_tree;

public class Solution {
    public boolean isValidBST(TreeNode root) {

        return doValid(root, null, null);


    }


    private boolean doValid(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }


        if (min != null && root.val <= min) {
            return false;
        }

        if (max != null && root.val >= max) {
            return false;
        }


        if (!doValid(root.left, min, root.val)) {
            return false;
        }

        if (!doValid(root.right, root.val, max)) {
            return false;
        }

        return true;
    }
}

