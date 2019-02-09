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

//    @Test
//    public void When_V_Then_5() throws Exception {
//        runAndCheck(5, "V");
//    }

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


    private void runAndCheck(int expected, String s) {
        Assert.assertEquals(expected, solution.romanToInt(s));
    }


//    Input: "III"
//    Output: 3
//    Example 2:
//
//    Input: "IV"
//    Output: 4
//    Example 3:
//
//    Input: "IX"
//    Output: 9
//    Example 4:
//
//    Input: "LVIII"
//    Output: 58
//    Explanation: L = 50, V= 5, III = 3.
//    Example 5:
//
//    Input: "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
}