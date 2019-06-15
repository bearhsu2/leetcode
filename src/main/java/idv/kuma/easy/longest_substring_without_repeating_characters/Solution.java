package idv.kuma.easy.longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() <= 0){
            return 0;
        }

        char[] chars = s.toCharArray();

        int head = 0;
        int tail = 0;

        Set<Character> window = new HashSet<>();
        window.add(chars[0]);
        int maxLength = 1;

        while(head < s.length() - 1){
            if (chars[head] == chars[head + 1]) {
                head++;
                tail = head;
                window.clear();
                window.add(chars[head]);
                if (window.size() > maxLength){
                    maxLength = window.size();
                }
            } else if (!window.contains(chars[head + 1])){
                head++;
                window.add(chars[head]);
                if (window.size() > maxLength){
                    maxLength = window.size();
                }
            } else {
                while (window.contains(chars[head + 1])){
                    window.remove(chars[tail]);
                    tail++;
                }
            }

        }

        return maxLength;
    }
}