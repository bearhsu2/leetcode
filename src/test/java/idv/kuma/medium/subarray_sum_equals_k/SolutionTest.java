package idv.kuma.medium.subarray_sum_equals_k;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void name() {
        Assertions.assertThat(new Solution()
                .subarraySum(new int[]{1, 1, 1}, 2)
        ).isEqualTo(2);

    }


    @Test
    public void name2() {
        Assertions.assertThat(new Solution()
                .subarraySum(new int[]{1, 1, -1, 1, -1}, 0)
        ).isEqualTo(4);

    }


    @Test
    public void name3() {
        Assertions.assertThat(new Solution()
                .subarraySum(new int[]{3, 5, -2, 8, 7, -15, 2, -8}, 2)
        ).isEqualTo(2);
    }
}