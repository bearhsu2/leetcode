package idv.kuma.medium.product_of_array_except_self;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _1_2_3_4_Then_4_12_8_6() {

        Assertions.assertThat(new Solution().productExceptSelf(new int[]{1, 2, 3, 4}))
                .containsExactly(24, 12, 8, 6);

    }
}