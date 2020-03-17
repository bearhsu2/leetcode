package idv.kuma.medium.perfect_square;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _1_Then_1() {
        Assertions.assertThat(new Solution().numSquares(1)).isEqualTo(1);
    }


    @Test
    public void _2_Then_2() {
        Assertions.assertThat(new Solution().numSquares(2)).isEqualTo(2);
    }


    @Test
    public void _3_Then_3() {
        Assertions.assertThat(new Solution().numSquares(3)).isEqualTo(3);
    }


    @Test
    public void _4_Then_1() {
        Assertions.assertThat(new Solution().numSquares(4)).isEqualTo(1);
    }


    @Test
    public void _12_Then_3() {
        Assertions.assertThat(new Solution().numSquares(12)).isEqualTo(3);
    }

    @Test
    public void _13_Then_4() {
        Assertions.assertThat(new Solution().numSquares(13)).isEqualTo(2);
    }
}