package idv.kuma.easy.count_and_say;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _1_1() {
        runAndCheck(1, "1");
    }

    @Test
    public void _2_11() {
        runAndCheck(2, "11");
    }

    @Test
    public void _3_21() {
        runAndCheck(3, "21");
    }

    @Test
    public void _4_to_10() {
        runAndCheck(4, "1211");
        runAndCheck(5, "111221");
        runAndCheck(6, "312211");
        runAndCheck(7, "13112221");
        runAndCheck(8, "1113213211");
        runAndCheck(9, "31131211131221");
        runAndCheck(10, "13211311123113112211");
    }

    private void runAndCheck(int n, String expectedResult) {
        Assert.assertEquals(expectedResult, new Solution().countAndSay(n));
    }
}

