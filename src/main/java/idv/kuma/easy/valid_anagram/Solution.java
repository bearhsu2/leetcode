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
            int index = t.charAt(i) - 'a';
            table[index]--;
            if (table[index] < 0) {
                return false;
            }

        }

        return true;
    }


}
