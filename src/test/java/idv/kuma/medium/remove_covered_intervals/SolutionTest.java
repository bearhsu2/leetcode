package idv.kuma.medium.remove_covered_intervals;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {

        int[][] intervals = {{1, 4}, {3, 6}, {2, 8}};

        int actual = new Solution().removeCoveredIntervals(intervals);

        Assert.assertEquals(2, actual);
    }
}