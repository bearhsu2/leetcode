package idv.kuma.medium.validate_binary_search_tree;

public class Solution {
    long last = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (!isValidBST(root.left)) {
            return false;
        }

        if (root.val <= last) {
            return false;
        }
        last = root.val;

        return isValidBST(root.right);

    }
}

