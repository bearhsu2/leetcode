package idv.kuma.easy.min_stack;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MinStack {


    private final List<Map.Entry<Integer, Integer>> valueToCurrentMinList;


    /**
     * initialize your data structure here.
     */
    public MinStack() {
        this.valueToCurrentMinList = new ArrayList<>();
    }


    public void push(int value) {
        int currentMin = this.getMin();

        this.valueToCurrentMinList.add(
                new AbstractMap.SimpleEntry<>(
                        value,
                        Math.min(currentMin, value))
        );


    }


    public int getMin() {

        if (valueToCurrentMinList.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return valueToCurrentMinList.get(valueToCurrentMinList.size() - 1).getValue();
        }

    }


    public void pop() {
        this.valueToCurrentMinList.remove(valueToCurrentMinList.size() - 1);
    }


    public int top() {
        return this.valueToCurrentMinList.get(valueToCurrentMinList.size() - 1).getKey();
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