package idv.kuma.easy.check_if_a_string_is_a_valid_sequence_from_root_to_leaves_path_in_a_binary_tree;

import idv.kuma.common.TreeNode;

class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {

        int length = arr.length;

        if (root == null) {
            return length == 0;
        }

        if (length == 0) {
            return false;
        }

        return root.val == arr[0] &&
                (isValidSequence(root.left, arr) || isValidSequence(root.right, arr));

    }
}