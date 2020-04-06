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


        char[] chars = str.toCharArray();

        List<Character> characters = new ArrayList<>();

        for (char aChar : chars) {
            characters.add(aChar);
        }

        Collections.sort(characters);

        return String.valueOf(characters);

    }
}