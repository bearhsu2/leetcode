package idv.kuma.easy.string_to_integer_atoi;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _42() {
        runAndCheck("42", 42);
    }


    private void runAndCheck(String str, int expected) {
        Assert.assertEquals(expected, new Solution().myAtoi(str));
    }


    @Test
    public void _spaces_n42() {
        runAndCheck("    -42", -42);
    }

    @Test
    public void _ending_words() {

        runAndCheck("4193 with words", 4193);
    }
    @Test
    public void _leading_words() {

        runAndCheck("words and 987", 0);
    }

}