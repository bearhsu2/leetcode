package idv.kuma.easy.count_and_say;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _1_11() {
        runAndCheck(1, "11");
    }

    private void runAndCheck(int n, String expectedResult) {
        Assert.assertEquals(expectedResult, new Solution().countAndSay(n));
    }
}

// 1.     1
//         2.     11
//         3.     21
//         4.     1211
//         5.     111221
//         6.     312211
//         7.     13112221
//         8.     1113213211
//         9.     31131211131221
//         10.     13211311123113112211