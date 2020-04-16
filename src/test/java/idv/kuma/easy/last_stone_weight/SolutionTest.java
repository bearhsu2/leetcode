package idv.kuma.easy.last_stone_weight;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {

        Assertions.assertThat(
                new Solution().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}))
                .isEqualTo(1);
    }
}