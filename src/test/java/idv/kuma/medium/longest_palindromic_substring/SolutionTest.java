package idv.kuma.medium.longest_palindromic_substring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void When_Empty_Then_Empty() {

        Assert.assertEquals("", new Solution().longestPalindrome(""));
    }

    @Test
    public void When_a_Then_a() {

        Assert.assertEquals("a", new Solution().longestPalindrome("a"));
    }
}