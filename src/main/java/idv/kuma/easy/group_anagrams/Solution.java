package idv.kuma.easy.group_anagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Set<Character>, List<String>> charsToStrings = new HashMap();

        for (String str : strs) {

            Set<Character> chars = toCharSet(str);

            if (!charsToStrings.containsKey(chars)) {

                charsToStrings.put(chars, new ArrayList<>());

            }

            charsToStrings.get(chars).add(str);

        }

        return new ArrayList<>(charsToStrings.values());

    }


    private Set<Character> toCharSet(String str) {

        Set<Character> result = new HashSet<>();

        for (char c : str.toCharArray()) {
            result.add(c);
        }

        return result;
    }
}