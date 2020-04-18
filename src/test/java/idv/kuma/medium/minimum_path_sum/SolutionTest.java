package idv.kuma.medium.minimum_path_sum;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        int[][] nums = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        Assertions.assertThat(
                new Solution().minPathSum(nums))
                .isEqualTo(7);
    }
}