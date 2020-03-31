package idv.kuma.easy.fibonacci_number;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _0_0() {

        Assert.assertEquals(0, new Solution().fib(0));

    }


    @Test
    public void _3_2() {

        Assert.assertEquals(2, new Solution().fib(3));

    }


    @Test
    public void _4_3() {

        Assert.assertEquals(3, new Solution().fib(4));

    }
}