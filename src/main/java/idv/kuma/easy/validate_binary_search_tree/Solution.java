package idv.kuma.easy.validate_binary_search_tree;

public class Solution {
    public boolean isValidBST(TreeNode root) {


        if (root.left != null) {


            if (root.left.val >= root.val) {
                return false;
            }

        }


        if (root.right != null) {
            if (root.right.val <= root.val) {
                return false;
            }
        }


        return true;


    }
}

