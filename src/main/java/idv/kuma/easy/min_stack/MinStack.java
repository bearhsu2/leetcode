package idv.kuma.easy.min_stack;

import java.util.Stack;
import java.util.TreeMap;

public class MinStack {

    private final Stack<Integer> stack;

    private final TreeMap<Integer, Integer> valueToTimes;


    /**
     * initialize your data structure here.
     */
    public MinStack() {
        this.stack = new Stack<>();
        this.valueToTimes = new TreeMap<>();
    }


    public void push(int value) {

        valueToTimes.merge(value, 1, Integer::sum);

        this.stack.push(value);
    }


    public void pop() {


        Integer popped = this.stack.pop();

        Integer times = valueToTimes.get(popped);

        if (times <= 1) {
            valueToTimes.remove(popped);
        } else {
            valueToTimes.put(popped, times - 1);
        }
    }


    public int top() {
        return this.stack.peek();
    }


    public int getMin() {

        return this.valueToTimes.firstKey();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */