package idv.kuma.easy.move_zeroes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _1_2_3_4_5() {

        int[] nums = {1, 2, 3, 4, 5};
        new Solution().moveZeroes(nums);
        Assertions.assertThat(nums).containsExactly(1, 2, 3, 4, 5);

    }


    @Test
    public void _0_2_3_4_5() {

        int[] nums = {0, 2, 3, 4, 5};
        new Solution().moveZeroes(nums);
        Assertions.assertThat(nums).containsExactly(2, 3, 4, 5, 0);

    }


    @Test
    public void _0() {

        int[] nums = {0};
        new Solution().moveZeroes(nums);
        Assertions.assertThat(nums).containsExactly(0);

    }


    @Test
    public void _0_1_0_3_12() {

//        Input: [0,1,0,3,12]
//        Output: [1,3,12,0,0]

        int[] nums = {0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        Assertions.assertThat(nums).containsExactly(1, 3, 12, 0, 0);

    }
}