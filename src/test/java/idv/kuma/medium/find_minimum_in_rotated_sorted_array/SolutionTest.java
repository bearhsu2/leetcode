package idv.kuma.medium.find_minimum_in_rotated_sorted_array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {

        Assertions.assertThat(new Solution().findMin(new int[]{3, 4, 5, 1, 2}))
                .isEqualTo(1);

        Assertions.assertThat(new Solution().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}))
                .isEqualTo(0);

        Assertions.assertThat(new Solution().findMin(new int[]{1, 2, 3}))
                .isEqualTo(1);

        Assertions.assertThat(new Solution().findMin(new int[]{3, 1, 2}))
                .isEqualTo(1);

        Assertions.assertThat(new Solution().findMin(new int[]{1, 2}))
                .isEqualTo(1);

        Assertions.assertThat(new Solution().findMin(new int[]{2, 1}))
                .isEqualTo(1);
    }
}