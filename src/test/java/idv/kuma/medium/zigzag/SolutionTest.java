package idv.kuma.medium.zigzag;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void When_PAYPALISHIRING_3_Then_PAHNAPLSIIGYIR() {

        Assert.assertEquals("PAHNAPLSIIGYIR", new Solution().convert("PAYPALISHIRING", 3));
    }


    @Test
    public void When_PAYPALISHIRING_4_Then_PINALSIGYAHRPI() {

        Assert.assertEquals("PINALSIGYAHRPI", new Solution().convert("PAYPALISHIRING", 4));
    }
}