package idv.kuma.easy.merge_sorted_array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _2_2_3_0_0_0_merge_2_5_6() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        solution.merge(
                nums1, 3,
                nums2, 3
        );

        Assertions.assertThat(nums1).containsExactly(1, 2, 2, 3, 4, 6);
    }
}