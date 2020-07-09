package idv.kuma.easy.first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {

        char[] chars = s.toCharArray();

        Map<Character, Integer> counts = new HashMap<>();


        for (char c : chars) {

            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (counts.get(chars[i]) == 1) {
                return i;
            }
        }

        return -1;

    }
}
