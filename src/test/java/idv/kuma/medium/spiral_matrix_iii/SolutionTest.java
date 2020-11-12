package idv.kuma.medium.spiral_matrix_iii;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _1_4_0_0() {

        int[][] actual = new Solution().spiralMatrixIII(1, 4, 0, 0);

        Assertions.assertThat(actual)
                .isEqualTo(
                        new int[][]{
                                {0, 0}, {0, 1}, {0, 2}, {0, 3}
                        }
                );

    }
}