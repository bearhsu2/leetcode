package idv.kuma.medium.bitwise_and_of_numbers_range;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void _0_1_Then_0() {

        Assertions.assertThat(
                new Solution().rangeBitwiseAnd(0, 1)
        ).isEqualTo(0);
    }

    @Test
    public void _5_7_Then_4() {

        Assertions.assertThat(
                new Solution().rangeBitwiseAnd(5, 7)
        ).isEqualTo(4);
    }
}