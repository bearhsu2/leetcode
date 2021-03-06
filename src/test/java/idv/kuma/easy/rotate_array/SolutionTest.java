package idv.kuma.easy.rotate_array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void _1_1_1() {


        int[] nums = {1};

        new Solution().rotate(nums, 2);

        Assertions.assertThat(nums).containsSequence(1);
    }
    @Test
    public void _1239_2_3912() {


        int[] nums = {1, 2, 3, 9};

        new Solution().rotate(nums, 2);

        Assertions.assertThat(nums).containsSequence(3, 9, 1, 2);
    }


    @Test
    public void _1234567_3_4567123() {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        new Solution().rotate(nums, 3);

        Assertions.assertThat(nums).containsSequence(5, 6, 7, 1, 2, 3, 4);
    }
}