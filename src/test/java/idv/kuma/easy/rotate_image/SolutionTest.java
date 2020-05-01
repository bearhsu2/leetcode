package idv.kuma.easy.rotate_image;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        new Solution().rotate(matrix);

        Assertions.assertThat(matrix)
                .containsExactly(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
    }
}