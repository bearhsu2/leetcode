package idv.kuma.medium.spiral_matrix_ii;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        int[][] actual = new Solution().generateMatrix(3);

        Assertions.assertThat(actual).isEqualTo(
                new int[][]{
                        {1, 2, 3},
                        {8, 9, 4},
                        {7, 6, 5}
                }
        );
    }
}