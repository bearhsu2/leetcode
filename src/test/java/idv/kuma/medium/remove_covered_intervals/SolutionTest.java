package idv.kuma.medium.remove_covered_intervals;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void case1() {

        int[][] intervals = {{1, 4}, {3, 6}, {2, 8}};

        int actual = new Solution().removeCoveredIntervals(intervals);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void case2() {

        int[][] intervals = {{3, 10}, {4, 10}, {5, 11}};

        int actual = new Solution().removeCoveredIntervals(intervals);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void case3() {

        int[][] intervals = {{1, 2}, {1, 4}, {3, 4}};

        int actual = new Solution().removeCoveredIntervals(intervals);

        Assert.assertEquals(1, actual);
    }
}