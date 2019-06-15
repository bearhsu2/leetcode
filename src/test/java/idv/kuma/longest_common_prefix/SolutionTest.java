package idv.kuma.longest_common_prefix;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void aaa_vvvb_Then_empty() {

        Assert.assertEquals("", createAndRun("aaa", "vvvb"));

    }

    private String createAndRun(String... strs) {
        return new Solution().longestCommonPrefix(strs);
    }
}