package idv.kuma.easy.convert_sorted_array_to_binary_tree;

import idv.kuma.common.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int[] ints = new int[]{-10, -3, 0, 5, 9};

        TreeNode root = new Solution().sortedArrayToBST(ints);


        System.out.println("");
    }
}