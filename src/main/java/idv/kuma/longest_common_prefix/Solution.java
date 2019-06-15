package idv.kuma.longest_common_prefix;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length <= 0) return "";


        String first = strs[0];

        int length = first.length();

        String result = "";


        for (int i = 1; i <= length; i++) {
            String subString = first.substring(0, i);

            boolean isPresent = Arrays.stream(strs).allMatch(str -> str.startsWith(subString));

            if (isPresent) {
                result = subString;
            } else {
                return result;
            }
        }

        return result;

    }
}