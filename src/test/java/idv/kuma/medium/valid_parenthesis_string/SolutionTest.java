package idv.kuma.medium.valid_parenthesis_string;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        Assertions.assertThat(new Solution().checkValidString("()")).isTrue();
        Assertions.assertThat(new Solution().checkValidString("(*)")).isTrue();
        Assertions.assertThat(new Solution().checkValidString("((*)")).isTrue();
        Assertions.assertThat(new Solution().checkValidString("(*))")).isTrue();
    }
}