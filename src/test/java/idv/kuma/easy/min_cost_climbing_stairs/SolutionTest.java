package idv.kuma.easy.min_cost_climbing_stairs;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _10_15_20_Then_15() {

        runAndCheck(15, 10, 15, 20);
    }

   @Test
    public void _1_100_1_1_1_100_1_1_100_1_Then_6() {

        runAndCheck(6, 1, 100, 1, 1, 1, 100, 1, 1, 100, 1);
    }


    private void runAndCheck(int expected, int... cost) {
        Assert.assertEquals(expected, new Solution().minCostClimbingStairs(cost));
    }
}