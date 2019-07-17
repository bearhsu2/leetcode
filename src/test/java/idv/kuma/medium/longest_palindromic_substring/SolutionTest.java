package idv.kuma.medium.longest_palindromic_substring;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class SolutionTest {

    @Test
    public void When_Empty_Then_Empty() {

        Assert.assertEquals("", new Solution().longestPalindrome(""));
    }

    @Test
    public void When_a_Then_a() {

        Assert.assertEquals("a", new Solution().longestPalindrome("a"));
    }

    @Test
    public void When_ab_Then_a() {

        Assert.assertEquals("a", new Solution().longestPalindrome("ab"));
    }

    @Test
    public void When_abba_Then_abba() {

        Assert.assertEquals("a", new Solution().longestPalindrome("ab"));
    }


    @Test
    public void When_abbab_Then_abba() {

        Assert.assertEquals("a", new Solution().longestPalindrome("ab"));
    }


    @Test
    public void When_SpecialString_Then_SpecialString() {

        String s = makeSpecialString();
        Assert.assertEquals(s, new Solution().longestPalindrome(s));
    }



    @Test
    public void When_ThousandZeros_Then_ThousandZeros() {

        String s = makeThousandZeros();

        System.out.println(s.length());

        Assert.assertEquals(s, new Solution().longestPalindrome(s));
    }

    private String makeThousandZeros() {
        return "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
    }


    @Test
    public void When_SpecialStringA_Then_SpecialString() {

        String s = makeSpecialString();
        Assert.assertEquals(s, new Solution().longestPalindrome(s + "aaaa"));
    }

    private String makeSpecialString() {
        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(0, 333).forEach(i -> sb.append("a"));
        IntStream.rangeClosed(0, 333).forEach(i -> sb.append("b"));
        IntStream.rangeClosed(0, 333).forEach(i -> sb.append("a"));
        return sb.toString();
    }

    @Test
    public void Test_isPallindromic() {

        Assert.assertTrue(new Solution().isPallindromic("a"));
        Assert.assertTrue(new Solution().isPallindromic("aba"));
        Assert.assertTrue(new Solution().isPallindromic("abba"));
        Assert.assertTrue(new Solution().isPallindromic("aabcbaa"));
        Assert.assertTrue(new Solution().isPallindromic("abccba"));

        Assert.assertFalse(new Solution().isPallindromic("aabcba"));
        Assert.assertFalse(new Solution().isPallindromic("aabcbffa"));
    }
}