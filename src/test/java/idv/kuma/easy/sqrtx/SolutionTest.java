package idv.kuma.easy.sqrtx;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _8_Then_2() {

        Assertions.assertThat(new Solution().mySqrt(8)).isEqualTo(2);

    }


    @Test
    public void _4_Then_2() {

        Assertions.assertThat(new Solution().mySqrt(4)).isEqualTo(2);


    }
}