package idv.kuma.easy.two_sum;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        Solution solution = new Solution();
        int[] actual = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        Assertions.assertThat(actual).containsExactly(0, 1);
    }
}