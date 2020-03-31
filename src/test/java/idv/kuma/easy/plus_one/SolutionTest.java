package idv.kuma.easy.plus_one;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _0_Then_1() {

        Assertions.assertThat(
                new Solution().plusOne(new int[]{0}))
                .containsExactly(1);
    }


    @Test
    public void _999_Then_1000() {

        Assertions.assertThat(
                new Solution().plusOne(new int[]{9, 9, 9}))
                .containsExactly(1, 0, 0, 0);
    }


    @Test
    public void _4321_Then_4322() {

        Assertions.assertThat(
                new Solution().plusOne(new int[]{4, 3, 2, 1}))
                .containsExactly(4, 3, 2, 2);
    }
}