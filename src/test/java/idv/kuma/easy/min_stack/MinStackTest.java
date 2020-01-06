package idv.kuma.easy.min_stack;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {
    @Test
    public void duplicated_values_operations() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(-3);
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-2);

        Assert.assertEquals(-2, minStack.top());
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(-3, minStack.top());
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-3, minStack.getMin());
    }


    @Test
    public void normal_operations() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());

        Assert.assertEquals(-2, minStack.getMin());
    }
}