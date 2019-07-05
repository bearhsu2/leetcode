package idv.kuma.easy.implement_strStr;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_Empty_Then_0() {

        Assert.assertEquals(0, new Solution().strStr("aaabbbccc", ""));

    }

    @Test
    public void Given_hello_When_ll_Then_2() {

        Assert.assertEquals(2, new Solution().strStr("hello", "ll"));

    }
}