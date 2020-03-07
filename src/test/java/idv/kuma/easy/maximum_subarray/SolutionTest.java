package idv.kuma.easy.maximum_subarray;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {

        Assertions
                .assertThat(new Solution().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}))
                .isEqualTo(6);
    }
}