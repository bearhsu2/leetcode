package idv.kuma.medium.set_matrix_zeroes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        new Solution().setZeroes(matrix);

        Assertions.assertThat(matrix).isEqualTo(
                new int[][]{
                        {1, 0, 3},
                        {0, 0, 0},
                        {7, 0, 9}
                }
        );
    }

    @Test
    public void name1() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 0},
                {7, 8, 9}
        };

        new Solution().setZeroes(matrix);

        Assertions.assertThat(matrix).isEqualTo(
                new int[][]{
                        {1, 2, 0},
                        {0, 0, 0},
                        {7, 8, 0}
                }
        );
    }
}