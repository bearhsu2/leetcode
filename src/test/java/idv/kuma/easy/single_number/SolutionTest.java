package idv.kuma.easy.single_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _2_2_2_Then_1() {

        Assert.assertEquals(1,
                new Solution().singleNumber(new int[]{2, 2, 1}));

    }
}