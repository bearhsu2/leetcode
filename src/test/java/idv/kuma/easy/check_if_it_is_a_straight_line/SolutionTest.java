package idv.kuma.easy.check_if_it_is_a_straight_line;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void True_Case() {

        Assertions.assertThat(
                new Solution().checkStraightLine(
                        new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}
                )
        ).isTrue();
    }

    @Test
    public void False_Case() {

        Assertions.assertThat(
                new Solution().checkStraightLine(
                        new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {7, 7}}
                )
        ).isFalse();
    }
}