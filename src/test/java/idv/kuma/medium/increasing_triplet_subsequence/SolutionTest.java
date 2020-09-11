package idv.kuma.medium.increasing_triplet_subsequence;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void _1_2() {

        Assert.assertFalse(new Solution().increasingTriplet(new int[]{1, 2}));
    }

    @Test
    public void _5_4_3_2_1() {

        Assert.assertFalse(new Solution().increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }


    @Test
    public void _1_2_3_4_5() {

        Assert.assertTrue(new Solution().increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }
}