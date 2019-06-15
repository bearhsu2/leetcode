package idv.kuma.longest_common_prefix;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void aaa_vvvb_Then_empty() {

        Assert.assertEquals("", new Solution().longestCommonPrefix(new String[]{"aaa", "vvvb"}));

    }
}