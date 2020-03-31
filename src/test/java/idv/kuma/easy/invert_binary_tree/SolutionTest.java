package idv.kuma.easy.invert_binary_tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void name() {



        TreeNode leftLeft = new TreeNode(1);
        TreeNode leftRight = new TreeNode(3);
        TreeNode left = new TreeNode(2);

        left.left = leftLeft;
        left.right = leftRight;

        TreeNode rightLeft = new TreeNode(6);
        TreeNode rightRight = new TreeNode(9);
        TreeNode right = new TreeNode(7);

        right.left = rightLeft;
        right.right = rightRight;

        TreeNode root = new TreeNode(4);
        root.left = left;
        root.right = right;

        Solution solution = new Solution();

        TreeNode result = solution.invertTree(root);

        System.out.println("aaa");

    }
}