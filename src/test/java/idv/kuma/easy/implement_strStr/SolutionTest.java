package idv.kuma.easy.implement_strStr;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_Empty_Then_0() {

        Solution solution = new Solution();

        int result = solution.strStr("aaabbbccc", "");

        Assert.assertEquals(0, result);
        
    }

    @Test
    public void Given_hello_When_ll_Then_2() {
    }
}