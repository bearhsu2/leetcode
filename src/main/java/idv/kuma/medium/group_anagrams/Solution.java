package idv.kuma.medium.group_anagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> charsToStrings = new HashMap();

        for (String str : strs) {

            String key = hash(str);

            if (!charsToStrings.containsKey(key)) {

                charsToStrings.put(key, new ArrayList<>());

            }

            charsToStrings.get(key).add(str);

        }

        return new ArrayList<>(charsToStrings.values());

    }


    private String hash(String str) {

        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 26; i++) {
            sb.append('#');
            sb.append(counts[i]);
        }

        return sb.toString();

    }
}