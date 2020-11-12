package idv.kuma.medium.longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        if (n <= 0) {
            return 0;
        }

        Set<Character> window = new HashSet<>();
        int i = 0;
        int j = 0;

        int maxLength = 0;
        while (i < n && j < n) {

            if (window.contains(s.charAt(j))) {
                window.remove(s.charAt(i));
                i++;
            } else {
                window.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            }

        }


        return maxLength;
    }
}