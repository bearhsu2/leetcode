package idv.kuma.easy.contiguous_array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {



    @Test
    public void name() {
        Assertions.assertThat(
                new Solution().findMaxLength(new int[]{0, 0, 1, 0, 0, 0, 1, 1}))
                .isEqualTo(6);

    }
}