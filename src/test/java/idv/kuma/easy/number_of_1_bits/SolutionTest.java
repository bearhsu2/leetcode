package idv.kuma.easy.number_of_1_bits;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void name() {
        Assertions.assertThat(new Solution().hammingWeight(-3)).isEqualTo(31);
    }


}