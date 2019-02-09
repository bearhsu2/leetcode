package idv.kuma.roman_to_integer;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_V_Then_5() throws Exception {
        Solution solution = new Solution();

        Assert.assertEquals(5, solution.romanToInt("V"));
    }

    @Test
    public void When_III_Then_3() throws Exception {
        Solution solution = new Solution();

        Assert.assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void When_II_Then_2() throws Exception {
        Solution solution = new Solution();

        Assert.assertEquals(2, solution.romanToInt("II"));
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