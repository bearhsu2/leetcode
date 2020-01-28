package idv.kuma.easy.valid_anagram;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name1() {
        runAndCheck(false, "anagram", "abc");

    }


    private void runAndCheck(boolean expected, String s, String t) {
        Assert.assertEquals(expected, new Solution().isAnagram(s, t));
    }


    @Test
    public void name2() {
        runAndCheck(true, "anagram", "nagaram");

    }


    @Test
    public void name3() {
        runAndCheck(false, "rat", "car");

    }
}