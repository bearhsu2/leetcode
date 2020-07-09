package idv.kuma.easy.first_unique_character_in_a_string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public int firstUniqChar(String s) {


        char[] chars = s.toCharArray();

        Set<Character> appeared = new HashSet<>();
        Set<Character> uniques = new LinkedHashSet<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];


            if (appeared.contains(c)) {
                uniques.remove(c);
            } else {
                appeared.add(c);
                uniques.add(c);
            }
        }


        if (uniques.isEmpty()) {
            return -1;
        }

        char target = uniques.iterator().next();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                return i;
            }
        }

        return -1;

    }
}
