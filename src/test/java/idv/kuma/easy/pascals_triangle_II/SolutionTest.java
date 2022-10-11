package idv.kuma.easy.pascals_triangle_II;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void _3() {

        Solution solution = new Solution();

        List<Integer> actual = solution.getRow(3);

        Assertions.assertThat(actual)
                .containsExactly(1, 3, 3, 1);

    }
}