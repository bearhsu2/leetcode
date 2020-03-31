package idv.kuma.easy.hamming_distance;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _1_4_Then_2() {

        Assertions.assertThat(new Solution().hammingDistance(1, 4)).isEqualTo(2);

    }
}