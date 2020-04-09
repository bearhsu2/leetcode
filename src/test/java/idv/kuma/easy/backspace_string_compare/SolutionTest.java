package idv.kuma.easy.backspace_string_compare;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        Assertions.assertThat(run("ab#c", "ad#c")).isTrue();
    }


    private boolean run(String s, String t) {
        return new Solution().backspaceCompare(s, t);
    }
}