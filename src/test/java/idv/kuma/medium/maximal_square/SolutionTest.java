package idv.kuma.medium.maximal_square;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        Assertions.assertThat(new Solution().maximalSquare(matrix))
                .isEqualTo(4);
    }


    @Test
    public void name1() {
        char[][] matrix = new char[][]{
                {'0', '1'},
                {'0', '1'}
        };

        Assertions.assertThat(new Solution().maximalSquare(matrix))
                .isEqualTo(1);
    }
}