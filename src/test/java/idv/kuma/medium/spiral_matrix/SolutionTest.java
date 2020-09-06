package idv.kuma.medium.spiral_matrix;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void name() {
        int[][] input = new int[][]{

                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> actual = new Solution().spiralOrder(input);

        Assertions.assertThat(actual).containsExactly(
                1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7
        );


    }
}