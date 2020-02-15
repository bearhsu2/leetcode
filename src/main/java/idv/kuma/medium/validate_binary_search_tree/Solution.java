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

        long previousLast = last;
        last = root.val;
        if (root.val <= previousLast) {
            return false;
        }

        return isValidBST(root.right);

    }
}

