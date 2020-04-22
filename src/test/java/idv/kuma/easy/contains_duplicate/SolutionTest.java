package idv.kuma.easy.contains_duplicate;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _1_2_3_1() {
        Assertions.assertThat(new Solution().containsDuplicate(new int[]{1, 2, 3, 1}))
                .isEqualTo(true);
    }
}