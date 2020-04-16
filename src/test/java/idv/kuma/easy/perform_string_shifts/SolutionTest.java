package idv.kuma.easy.perform_string_shifts;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        String s = "abc";
        int[][] shift = new int[][]{{0, 1}, {1, 2}};

        Assert.assertEquals("cab", new Solution().stringShift(s, shift));
    }


    @Test
    public void test2() {
        String s = "abcdefg";
        int[][] shift = new int[][]{{1, 1}, {1, 1}, {0, 2}, {1, 3}};

        Assert.assertEquals("efgabcd", new Solution().stringShift(s, shift));
    }
}