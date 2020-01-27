package idv.kuma.easy.valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> characterToCount = new HashMap<>();

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (char sChar : sChars) {
            adjustMap(characterToCount, sChar);
        }


        for (char tChar : tChars) {
            Integer count = characterToCount.get(tChar);

            if (count == null || count == 0) {
                return false;
            }

            characterToCount.put(tChar, count - 1);


        }


        return true;
    }


    private void adjustMap(Map<Character, Integer> characterToCount, char c) {
        Integer count = characterToCount.get(c);
        if (count == null) {
            characterToCount.put(c, 0);
            count = 0;
        }

        characterToCount.put(c, count + 1);

    }
}
