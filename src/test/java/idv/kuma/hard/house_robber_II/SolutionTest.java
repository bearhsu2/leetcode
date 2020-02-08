package idv.kuma.hard.house_robber_II;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _2_3_1_Then_3() {

        Assert.assertEquals(
                3,
                new Solution().rob(new int[]{2, 3, 1}));

    }
}