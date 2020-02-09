package idv.kuma.medium.longest_palindromic_substring;

class Solution {
    public String longestPalindrome(String s) {


        int length = s.length();
        if (length <= 1) return s;


        char[] chars = s.toCharArray();
        String longest = null;

        boolean[][] isPalindrome = new boolean[length][length];

        for (int i = 0; i < length; i++) {
            isPalindrome[i][i] = true;
            longest = s.substring(i, i + 1);

        }


        for (int tryLength = 2; tryLength <= length; tryLength++) {

            for (int i = 0; i < length; i++) {
                int j = i + tryLength - 1;

                if (j < length) {
                    if ((tryLength <= 3 || isPalindrome[i + 1][j - 1]) && chars[i] == chars[j]) {
                        isPalindrome[i][j] = true;
                        longest = s.substring(i, i + tryLength);
                    }
                }
            }
        }

        return longest;


    }
}