package idv.kuma.easy.happy_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _19_True() {
        Assert.assertTrue(new Solution().isHappy(19));
        Assert.assertFalse(new Solution().isHappy(18));
    }
}