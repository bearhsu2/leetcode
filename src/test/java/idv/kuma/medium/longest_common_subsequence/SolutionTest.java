package idv.kuma.medium.longest_common_subsequence;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void abcde_ace_Then_ace() {

        Assertions.assertThat(new Solution().longestCommonSubsequence("abcde", "ace")).isEqualTo(3);

    }
}