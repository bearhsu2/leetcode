package idv.kuma.easy.greatest_common_divisor_of_strings;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void ABCABC_ABC_Then_ABC() {
        runAndCheck("ABCABC", "ABC", "ABC");
    }


    private void runAndCheck(String str1, String str2, String expected) {
        Assert.assertEquals(expected, new Solution().gcdOfStrings(str1, str2));
    }


    @Test
    public void ABABAB_ABAB_Then_AB() {
        runAndCheck("ABAB", "ABABAB", "AB");
    }

    @Test
    public void LEET_CODE_Then_EMPTY() {
        runAndCheck("LEET", "CODE", "");
    }
    @Test
    public void ABC_ABC_Then_ABC() {
        runAndCheck("ABC", "ABC", "ABC");
    }
}