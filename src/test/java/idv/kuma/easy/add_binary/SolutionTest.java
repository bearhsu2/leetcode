package idv.kuma.easy.add_binary;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void _11_1_Then_100() {

        Assertions.assertThat(new Solution().addBinary("11", "1"))
                .isEqualTo("100");

    }


    @Test
    public void _1110110101_1110111011_Then_11101110000() {

        Assertions.assertThat(new Solution().addBinary("1110110101", "1110111011"))
                .isEqualTo("11101110000");
    }

    @Test
    public void _1010_1011_Then_10101() {

        Assertions.assertThat(new Solution().addBinary("1010", "1011"))
                .isEqualTo("10101");
    }
}
