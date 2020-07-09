package idv.kuma.easy.jewels_and_stones;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void aA_aAAbbbb_Then_3() {

        runAndCheck("aA", "aAAbbbb", 3);

    }


    private void runAndCheck(String J, String S, int expected) {
        Assertions.assertThat(
                new Solution().numJewelsInStones(J, S)
        ).isEqualTo(expected);
    }
}