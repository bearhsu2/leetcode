package idv.kuma.easy.implement_strStr;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_Empty_Then_0() {

        runAndCheck(0, "aaabbbccc", "");

    }

    private void runAndCheck(int i, String aaabbbccc, String s) {
        Assert.assertEquals(i, new Solution().strStr(aaabbbccc, s));
    }

    @Test
    public void Given_hello_When_ll_Then_2() {

        runAndCheck(2, "hello", "ll");

    }


    @Test
    public void Given_hello_When_aaa_Then_Neg1() {

        runAndCheck(-1, "hello", "aaa");

    }
}