package idv.kuma.easy.first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : chars) {
            counts.merge(c, 1, Integer::sum);
        }

        for (int i = 0; i < chars.length; i++) {
            if (counts.get(chars[i]) == 1) {
                return i;
            }
        }

        return -1;

    }
}
