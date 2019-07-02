package idv.kuma.easy.valid_parenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    private static Map<Character, Character> leftToRight = new HashMap<>();

    static {
        leftToRight.put('(', ')');
        leftToRight.put('[', ']');
        leftToRight.put('{', '}');
    }


    public boolean isValid(String s) {

        if (s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (leftToRight.containsKey(aChar)) {
                stack.push(aChar);
            } else {

                Character pop;

                try {
                    pop = stack.pop();
                } catch (Exception e) {
                    return false;
                }

                if (!leftToRight.get(pop).equals(aChar)) {
                    return false;
                }

            }
        }

        return stack.isEmpty();

    }
}
