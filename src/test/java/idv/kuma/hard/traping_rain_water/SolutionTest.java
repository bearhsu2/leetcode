package idv.kuma.hard.traping_rain_water;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        runAndCheck(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6);
    }

    @Test
    public void name2() {
        runAndCheck(new int[]{2, 0, 2}, 2);
    }

    @Test
    public void name3() {
        runAndCheck(new int[]{5, 5, 1, 7, 1, 1, 5, 2, 7, 6}, 23);
    }

    private void runAndCheck(int[] heights, int expected) {
        Solution solution = new Solution();

        int actual = solution.trap(heights);

        Assert.assertEquals(expected, actual);
    }
}