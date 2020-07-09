package idv.kuma.easy.first_unique_character_in_a_string;

import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void leetcode_0() {

        runAndCheck("leetcode", 0);
    }


    @Test
    public void aadadaad_n1() {

        runAndCheck("aadadaad", -1);
    }

    private AbstractIntegerAssert<?> runAndCheck(String string, int expected) {
        return Assertions.assertThat(new Solution().firstUniqChar(string)).isEqualTo(expected);
    }


    @Test
    public void loveleetcode_2() {

        runAndCheck("loveleetcode", 2);
    }
}
