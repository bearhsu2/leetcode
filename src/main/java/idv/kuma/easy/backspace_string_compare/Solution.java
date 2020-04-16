package idv.kuma.easy.backspace_string_compare;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    // Two pointers, stack


    public boolean backspaceCompare(String S, String T) {

        return trace(S).equals(trace(T));
    }


    private String trace(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        return String.valueOf(stack);

    }


}
