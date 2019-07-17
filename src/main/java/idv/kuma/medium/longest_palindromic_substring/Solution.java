package idv.kuma.medium.longest_palindromic_substring;

class Solution {
    public String longestPalindrome(String s) {

        int longestLength = 0;
        String longestSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {


                String currentSubstring = s.substring(i, j);

                if (isPallindromic(currentSubstring)) {

                    int currentLength = currentSubstring.length();
                    if (currentLength > longestLength) {
                        longestLength = currentLength;
                        longestSubstring = currentSubstring;
                    }

                }
            }
        }

        return longestSubstring;
    }

    boolean isPallindromic(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}