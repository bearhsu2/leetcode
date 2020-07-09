package idv.kuma.easy.valid_perfect_square;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        Assertions.assertThat(
                new Solution().isPerfectSquare(16)
        ).isTrue();
    }


    @Test
    public void large() {
        Assertions.assertThat(
                new Solution().isPerfectSquare(2147483647)
        ).isFalse();

    }


    @Test
    public void _808201() {
        Assertions.assertThat(
                new Solution().isPerfectSquare(808201)
        ).isTrue();

    }


}