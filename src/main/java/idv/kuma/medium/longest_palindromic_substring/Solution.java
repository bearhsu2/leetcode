package idv.kuma.medium.longest_palindromic_substring;

class Solution {
    public String longestPalindrome(String s) {


        int length = s.length();
        if (length <= 1) return s;


        char[] chars = s.toCharArray();
        String longest = null;

        boolean[][] isPalindrome = new boolean[length][length];


        for (int tryLength = 1; tryLength <= length; tryLength++) {

            for (int i = 0; i + tryLength - 1 < length; i++) {
                int j = i + tryLength - 1;

                if ((i == j || tryLength <= 3 || isPalindrome[i + 1][j - 1]) && chars[i] == chars[j]) {
                    isPalindrome[i][j] = true;
                    longest = s.substring(i, i + tryLength);
                }
            }
        }

        return longest;


    }
}