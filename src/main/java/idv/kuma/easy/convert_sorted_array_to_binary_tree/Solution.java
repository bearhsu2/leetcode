package idv.kuma.easy.convert_sorted_array_to_binary_tree;

import idv.kuma.common.TreeNode;

import java.util.Arrays;

class Solution {


    public TreeNode sortedArrayToBST(int[] nums) {


        int length = nums.length;

        if (length == 0) {
            return null;
        }

        int mid = length / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, length));


        return root;
    }
}