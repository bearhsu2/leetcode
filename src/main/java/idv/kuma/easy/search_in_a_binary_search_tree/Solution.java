package idv.kuma.easy.search_in_a_binary_search_tree;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {


        return doRecursive(root, val);


    }


    private TreeNode doRecursive(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        if (val < root.val) {
            return doRecursive(root.left, val);
        }

        return doRecursive(root.right, val);
    }
}



