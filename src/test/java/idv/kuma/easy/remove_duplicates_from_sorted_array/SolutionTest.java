package idv.kuma.easy.remove_duplicates_from_sorted_array;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_1_1_2_Then_Return_2() throws Exception {

        int[] original = new int[]{1, 1, 2};
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.removeDuplicates(original));
        Assert.assertArrayEquals(new int[]{1, 2, 1}, original);

    }

    @Test
    public void When_0_0_1_1_1_2_2_3_3_4_Then_Return_5() throws Exception {

        int[] original = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.removeDuplicates(original));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 0, 1, 1, 2, 3}, original);

    }

    @Test
    public void When_1_1_Then_Return_1() throws Exception {

        int[] original = new int[]{1, 1};
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.removeDuplicates(original));
        Assert.assertArrayEquals(new int[]{1, 1}, original);

    }

    @Test
    public void When_1_2_Then_Return_1() throws Exception {

        int[] original = new int[]{1, 2};
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.removeDuplicates(original));
        Assert.assertArrayEquals(new int[]{1, 2}, original);

    }
}