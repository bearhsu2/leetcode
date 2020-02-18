package idv.kuma.medium.binary_number_with_alternating_bits;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void False_Cases() {

        Assert.assertFalse(new Solution().hasAlternatingBits(7));
        Assert.assertFalse(new Solution().hasAlternatingBits(11));
    }


    @Test
    public void True_Cases() {

        Assert.assertTrue(new Solution().hasAlternatingBits(5));
        Assert.assertTrue(new Solution().hasAlternatingBits(10));
    }
}