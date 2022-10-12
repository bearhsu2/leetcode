package idv.kuma.easy.largest_perimeter_triangle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _2_1_2() {
        Solution solution = new Solution();
        int actual = solution.largestPerimeter(new int[]{2, 1, 2});

        Assertions.assertThat(actual).isEqualTo(5);
    }
}