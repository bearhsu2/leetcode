package idv.kuma.easy.valid_parenthesis;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void Simple_True_Cases() {
        Solution solution = new Solution();


        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("[]"));
        Assert.assertTrue(solution.isValid("[]{}()"));
        Assert.assertTrue(solution.isValid(""));
        Assert.assertTrue(solution.isValid("([[{}]])"));

    }


    @Test
    public void Simple_False_Cases() {
        Solution solution = new Solution();

        Assert.assertFalse(solution.isValid("{"));
        Assert.assertFalse(solution.isValid("}{"));
        Assert.assertFalse(solution.isValid("[{]}"));

    }
}