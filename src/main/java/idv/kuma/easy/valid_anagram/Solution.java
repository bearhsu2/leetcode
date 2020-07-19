package idv.kuma.easy.valid_anagram;

public class Solution {
    public boolean isAnagram(String s, String t) {

        int length = s.length();
        if (length != t.length()) {
            return false;
        }

        char[] sChars = new char[26];
        char[] tChars = new char[26];


        for (int i = 0; i < length; i++) {

            sChars[s.charAt(i) - 'a']++;
            tChars[t.charAt(i) - 'a']++;

        }

        for (int i = 0; i < 26; i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }


        return true;
    }


}
