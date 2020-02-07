package idv.kuma.easy.house_robber;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _1_2_3_1_then_4() {

        Assert.assertEquals(4,
                new Solution().rob(new int[]{1, 2, 3, 1}));

    }


    @Test
    public void _2_7_9_3_1_then_12() {

        Assert.assertEquals(12,
                new Solution().rob(new int[]{2, 7, 9, 3, 1}));

    }
}