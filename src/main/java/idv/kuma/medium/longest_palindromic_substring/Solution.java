package idv.kuma.medium.longest_palindromic_substring;

class Solution {
    public String longestPalindrome(String s) {


        int length = s.length();
        if (length <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        String currentLongestPalindrome = null;

        boolean[][] isPalindrome = new boolean[length][length];

        for (int i = 0; i < length; i++) {
            isPalindrome[i][i] = true;
            currentLongestPalindrome = s.substring(i, i + 1);


        }
        for (int i = 0; i < length - 1; i++) {

            if (chars[i] == chars[i + 1]) {
                isPalindrome[i][i + 1] = true;
                currentLongestPalindrome = s.substring(i, i + 2);
            }
        }

        for (int tryLength = 3; tryLength <= length; tryLength++) {


            for (int i = 0; i < length; i++) {
                int j = i + tryLength - 1;


                if (j < length) {
                    isPalindrome[i][j] =
                            isPalindrome[i + 1][j - 1]
                                    && chars[i] == chars[j];
                    if (isPalindrome[i][j]) {
                        currentLongestPalindrome = s.substring(i, j + 1);
                    }
                }


            }


        }

        return currentLongestPalindrome;


    }
}