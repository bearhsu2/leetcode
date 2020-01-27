package idv.kuma.easy.valid_anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> characterToCount = new HashMap<>();

//        char[] sChars = s.toCharArray();
//        char[] tChars = t.toCharArray();

        // phase 1: iterate s
//        for (int i = 0; i < sChars.length; i++) {
//
//
//
//
//        }


        for (char c : s.toCharArray()) {
            adjustMap(characterToCount, c, 1);
        }

        // phase 2: iterate t
        for (char c : t.toCharArray()) {
            adjustMap(characterToCount, c, -1);
        }


        // check if map contains only 0
        return characterToCount.values()
                .stream()
                .allMatch(count -> count == 0);
    }


    private void adjustMap(Map<Character, Integer> characterToCount, char c, int adjustment) {
        Integer count = characterToCount.get(c);
        if (Objects.isNull(count)) {
            characterToCount.put(c, 0);
            count = 0;
        }
        characterToCount.put(c, count + adjustment);
    }
}
