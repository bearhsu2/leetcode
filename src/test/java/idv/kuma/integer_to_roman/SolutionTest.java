package idv.kuma.integer_to_roman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {


    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

    }

    @Test
    public void When_1_Then_I() throws Exception {
        runAndCheck(1, "I");
    }

    @Test
    public void When_2_Then_II() throws Exception {
        runAndCheck(2, "II");
    }

    @Test
    public void When_5_Then_V() throws Exception {
        runAndCheck(5, "V");
    }

    @Test
    public void When_4_Then_IV() throws Exception {
        runAndCheck(4, "IV");
    }

    @Test
    public void When_3_Then_III() throws Exception {
        runAndCheck(3, "III");
    }


    @Test
    public void When_6_Then_VI() throws Exception {
        runAndCheck(6, "VI");
    }

    @Test
    public void When_7_Then_VII() throws Exception {
        runAndCheck(7, "VII");
    }

    @Test
    public void When_9_Then_IX() throws Exception {
        runAndCheck(9, "IX");
    }

    @Test
    public void When_10_Then_X() throws Exception {
        runAndCheck(10, "X");
    }

    @Test
    public void When_15_Then_XV() throws Exception {
        runAndCheck(15, "XV");
    }

    @Test
    public void When_14_Then_XIV() throws Exception {
        runAndCheck(14, "XIV");
    }

    @Test
    public void When_19_Then_XIX() throws Exception {
        runAndCheck(19, "XIX");
    }

    @Test
    public void When_20_Then_XX() throws Exception {
        runAndCheck(20, "XX");
    }


    @Test
    public void When_58_Then_LVIII() throws Exception {
        runAndCheck(58, "LVIII");
    }

    @Test
    public void When_94_Then_XCIV() throws Exception {
        runAndCheck(94, "XCIV");
    }

    @Test
    public void When_99_Then_XCIX() throws Exception {
        runAndCheck(99, "XCIX");
    }

    @Test
    public void When_100_Then_C() throws Exception {
        runAndCheck(100, "C");
    }

    @Test
    public void When_345_Then_CCCXLV() throws Exception {
        runAndCheck(345, "CCCXLV");
    }

    @Test
    public void When_768_Then_DCCLXVIII() throws Exception {
        runAndCheck(768, "DCCLXVIII");
    }


    @Test
    public void When_999_Then_DCCLXVIII() throws Exception {
        runAndCheck(999, "CMXCIX");
    }

    @Test
    public void When_1994_Then_MCMXCIV() throws Exception {
        runAndCheck(1994, "MCMXCIV");
    }

    @Test
    public void When_3999_Then_MMMCMXCIX() throws Exception {
        runAndCheck(3999, "MMMCMXCIX");
    }

    private void runAndCheck(int num, String expect) {
        Assert.assertEquals(expect, solution.intToRoman(num));
    }
}