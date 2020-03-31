package idv.kuma.easy.length_of_last_word;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void Hello_World_Then_5() {
        Assertions.assertThat(new Solution().lengthOfLastWord("Hello World")).isEqualTo(5);
    }
}