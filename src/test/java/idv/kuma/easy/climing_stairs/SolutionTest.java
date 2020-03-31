package idv.kuma.easy.climing_stairs;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        Assertions.assertThat(new Solution().climbStairs(1)).isEqualTo(1);
        Assertions.assertThat(new Solution().climbStairs(2)).isEqualTo(2);
        Assertions.assertThat(new Solution().climbStairs(3)).isEqualTo(3);
        Assertions.assertThat(new Solution().climbStairs(4)).isEqualTo(5);
        Assertions.assertThat(new Solution().climbStairs(5)).isEqualTo(8);
        Assertions.assertThat(new Solution().climbStairs(6)).isEqualTo(13);
        Assertions.assertThat(new Solution().climbStairs(7)).isEqualTo(21);
        Assertions.assertThat(new Solution().climbStairs(8)).isEqualTo(34);
        Assertions.assertThat(new Solution().climbStairs(9)).isEqualTo(55);
        Assertions.assertThat(new Solution().climbStairs(10)).isEqualTo(89);
    }
}