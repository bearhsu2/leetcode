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
    public void _plus1() {
        runAndCheck("+1", 1);
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


    @Test
    public void _underflow() {

        runAndCheck("-91283472332", -2147483648);
    }


    @Test
    public void _overflow() {

        runAndCheck("20000000000000000000", Integer.MAX_VALUE);
    }


    @Test
    public void _3p14159() {

        runAndCheck("3.14159", 3);
        runAndCheck("-3.14159", -3);
    }


    @Test
    public void empty() {

        runAndCheck("", 0);
    }


    @Test
    public void _one_signal() {

        runAndCheck("+", 0);
    }
}