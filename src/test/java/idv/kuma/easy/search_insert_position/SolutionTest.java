package idv.kuma.easy.search_insert_position;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void Given_Empty_When_3_Then_0() {

        Solution solution = new Solution();
        int result = solution.searchInsert(new int[0], 3);
        Assert.assertEquals(0, result);
    }

    @Test
    public void Given_1_2_4_5_When_3_Then_2() {

        Solution solution = new Solution();
        int result = solution.searchInsert(new int[]{1, 2, 4, 5}, 3);
        Assert.assertEquals(2, result);
    }
}