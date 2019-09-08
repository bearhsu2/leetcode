package idv.kuma.easy.count_and_say;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<Integer, String> knownResult = new HashMap<>();

    static {
        knownResult.put(1, "1");
    }


    public String countAndSay(int n) {

        if (knownResult.containsKey(n)) {
            return knownResult.get(n);
        }

        return doCountAndSay(countAndSay(n - 1));


    }

    private String doCountAndSay(String countAndSay) {

        char[] chars = countAndSay.toCharArray();

        StringBuilder sb = new StringBuilder();
        char currentChar = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {

            char nextChar = chars[i];

            if (nextChar == currentChar) {
                count++;
            } else {
                sb.append(makeSubstring(currentChar, count));
                currentChar = nextChar;
                count = 1;
            }
        }
        sb.append(makeSubstring(currentChar, count));

        return sb.toString();

    }

    private StringBuilder makeSubstring(char currentChar, int count) {
        return new StringBuilder().append(count).append(currentChar);
    }
}