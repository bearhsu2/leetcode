package idv.kuma.easy.happy_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _19_True() {
        Assert.assertFalse(new Solution().isHappy(18));
        Assert.assertTrue(new Solution().isHappy(19));
    }
}