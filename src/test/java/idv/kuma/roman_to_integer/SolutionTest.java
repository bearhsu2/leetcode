package idv.kuma.roman_to_integer;

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
    public void When_V_Then_5() throws Exception {
        runAndCheck(5, "V");
    }

    @Test
    public void When_IV_Then_4() throws Exception {
        runAndCheck(4, "IV");
    }

    @Test
    public void When_III_Then_3() throws Exception {
        runAndCheck(3, "III");
    }

    @Test
    public void When_II_Then_2() throws Exception {
        runAndCheck(2, "II");
    }

    @Test
    public void When_I_Then_1() throws Exception {
        runAndCheck(1, "I");
    }

    @Test
    public void When_VI_Then_6() throws Exception {
        runAndCheck(6, "VI");
    }

    @Test
    public void When_VII_Then_7() throws Exception {
        runAndCheck(7, "VII");
    }

    @Test
    public void When_IX_Then_9() throws Exception {
        runAndCheck(9, "IX");
    }

    @Test
    public void When_X_Then_10() throws Exception {
        runAndCheck(10, "X");
    }

    @Test
    public void When_XV_Then_15() throws Exception {
        runAndCheck(15, "XV");
    }

    @Test
    public void When_XIV_Then_14() throws Exception {
        runAndCheck(14, "XIV");
    }

    @Test
    public void When_XIX_Then_19() throws Exception {
        runAndCheck(19, "XIX");
    }

    @Test
    public void When_XX_Then_20() throws Exception {
        runAndCheck(20, "XX");
    }


    @Test
    public void When_LVIII_Then_58() throws Exception {
        runAndCheck(58, "LVIII");
    }

    @Test
    public void When_XCIV_Then_94() throws Exception {
        runAndCheck(94, "XCIV");
    }

    @Test
    public void When_XCIX_Then_99() throws Exception {
        runAndCheck(99, "XCIX");
    }

    @Test
    public void When_C_Then_100() throws Exception {
        runAndCheck(100, "C");
    }

    @Test
    public void When_CCCXLV_Then_345() throws Exception {
        runAndCheck(345, "CCCXLV");
    }
    @Test
    public void When_DCCLXVIII_Then_768() throws Exception {
        runAndCheck(768, "DCCLXVIII");
    }


    @Test
    public void When_DCCLXVIII_Then_999() throws Exception {
        runAndCheck(999, "CMXCIX");
    }

//    @Test
//    public void When_MCMXCIV_Then_1994() throws Exception {
//        runAndCheck(1994, "MCMXCIV");
//    }


//
//    Input: "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    private void runAndCheck(int expected, String s) {
        Assert.assertEquals(expected, solution.romanToInt(s));
    }
}