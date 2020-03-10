package idv.kuma.easy.sqrtx;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void big_numbers() {
        Assertions.assertThat(new Solution().mySqrt(2147395599)).isEqualTo(46339);
        Assertions.assertThat(new Solution().mySqrt(2147483647)).isEqualTo(46340);

    }

    @Test
    public void _8192_Then_90() {

        Assertions.assertThat(new Solution().mySqrt(8192)).isEqualTo(90);

    }
    @Test
    public void _8_Then_2() {

        Assertions.assertThat(new Solution().mySqrt(8)).isEqualTo(2);

    }


    @Test
    public void _4_Then_2() {

        Assertions.assertThat(new Solution().mySqrt(4)).isEqualTo(2);


    }
}