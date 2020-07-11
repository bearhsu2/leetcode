package idv.kuma.easy.valid_palindrome;

import org.assertj.core.api.AbstractBooleanAssert;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void empty() {
        runAndCheck("", true);
    }

    @Test
    public void example1() {
        runAndCheck("A man, a plan, a canal: Panama", true);
    }
    @Test
    public void abcba() {
        runAndCheck("abcba", true);
    }


    @Test
    public void abcbaa() {
        runAndCheck("abcbaa", false);
    }

    @Test
    public void abcb_a() {
        runAndCheck("abc_ba", true);
    }

    private AbstractBooleanAssert<?> runAndCheck(String s, boolean expected) {
        return Assertions.assertThat(new Solution().isPalindrome(s)).isEqualTo(expected);
    }
}