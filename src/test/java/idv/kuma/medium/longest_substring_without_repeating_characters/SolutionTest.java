package idv.kuma.medium.longest_substring_without_repeating_characters;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void abcabcbb() {

        Assertions.assertThat(new Solution().lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }
}