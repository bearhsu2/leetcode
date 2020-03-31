package idv.kuma.medium.longest_common_subsequence;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();

        int length1 = chars1.length;
        int length2 = chars2.length;

        int[][] lcs = new int[length1 + 1][length2 + 1];

        for (int i = 0; i <= length1; i++) {
            for (int j = 0; j <= length2; j++) {
                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else {
                    lcs[i][j] = chars1[i - 1] == chars2[j - 1]
                            ? lcs[i - 1][j - 1] + 1
                            : Math.max(lcs[i][j - 1], lcs[i - 1][j]);
                }
            }

        }

        return lcs[length1][length2];
    }
}
