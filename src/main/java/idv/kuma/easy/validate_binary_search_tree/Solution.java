package idv.kuma.easy.validate_binary_search_tree;

public class Solution {
    public boolean isValidBST(TreeNode root) {


        if (root.left != null) {


            return root.left.val < root.val;

        }


        return true;


    }
}

