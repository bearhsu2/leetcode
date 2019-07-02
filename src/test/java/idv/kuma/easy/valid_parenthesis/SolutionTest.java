package idv.kuma.easy.valid_parenthesis;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void True() {
        Solution solution = new Solution();

        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("[]"));

    }
}