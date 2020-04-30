package idv.kuma.medium.jump_game;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _2_3_1_1_4_Then_True() {
        Assertions.assertThat(new Solution().canJump(new int[]{2, 3, 1, 1, 4}))
                .isEqualTo(true);
    }


    @Test
    public void _3_2_1_0_4_Then_False() {
        Assertions.assertThat(new Solution().canJump(new int[]{3, 2, 1, 0, 4}))
                .isEqualTo(false);
    }
}