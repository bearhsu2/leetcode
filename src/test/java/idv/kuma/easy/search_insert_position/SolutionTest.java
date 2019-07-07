package idv.kuma.easy.search_insert_position;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void Given_Empty_When_3_Then_0() {

        runAndTest(new int[0], 3, 0);
    }

    @Test
    public void Given_1_2_4_5_When_3_Then_2() {

        runAndTest(new int[]{1, 2, 4, 5}, 3, 2);
    }

    @Test
    public void Given_1_3_5_6_When_5_Then_2() {

        runAndTest(new int[]{1, 3, 5, 6}, 5, 2);
    }

    @Test
    public void Given_1_3_5_6_When_2_Then_1() {

        runAndTest(new int[]{1, 3, 5, 6}, 2, 1);
    }


    private void runAndTest(int[] nums, int target, int expected) {
        Solution solution = new Solution();
        int result = solution.searchInsert(nums, target);
        Assert.assertEquals(expected, result);
    }



//    Example 2:
//    Input: [1,3,5,6], 2
//    Output: 1


//    Example 3:
//    Input: [1,3,5,6], 7
//    Output: 4


//    Example 4:
//    Input: [1,3,5,6], 0
//    Output: 0
}