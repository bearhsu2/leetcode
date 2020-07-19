package idv.kuma.easy.valid_anagram;

public class Solution {
    public boolean isAnagram(String s, String t) {

        int length = s.length();
        if (length != t.length()) {
            return false;
        }

        int[] table = new int[26];


        for (int i = 0; i < length; i++) {
            table[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < length; i++) {
            table[t.charAt(i) - 'a']--;

            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }

        }

        return true;
    }


}
