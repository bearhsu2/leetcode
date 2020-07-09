package idv.kuma.easy.intersection_of_two_arrays_ii;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        int[] result = new Solution().intersect(nums1, nums2);

        Assertions.assertThat(result).containsExactlyInAnyOrder(2, 2);
    }
}