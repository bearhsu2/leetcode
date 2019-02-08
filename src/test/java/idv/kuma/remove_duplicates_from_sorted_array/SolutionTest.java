package idv.kuma.remove_duplicates_from_sorted_array;

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
}