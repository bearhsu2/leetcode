package idv.kuma._26_remove_duplicates_from_sorted_array;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_1_1_2_Then_Return_2() throws Exception {

        Assert.assertEquals(2, new Solution().removeDuplicates(new int[]{1, 1, 2}));

    }
}