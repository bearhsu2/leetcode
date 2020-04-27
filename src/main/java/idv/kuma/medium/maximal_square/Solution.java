package idv.kuma.medium.maximal_square;

public class Solution {
    public int maximalSquare(char[][] matrix) {

        int height = matrix.length;

        if (height == 0) {
            return 0;
        }

        int width = matrix[0].length;

        int[][] dp = new int[height][width];

        int maxSideLength = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (matrix[i][j] == '1') {

                    dp[i][j] = i == 0 || j == 0
                            ? 1
                            : min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1;

                    maxSideLength = Math.max(maxSideLength, dp[i][j]);

                }
            }
        }


        return maxSideLength * maxSideLength;
    }


    private int min(int i, int j, int k) {
        return Math.min(Math.min(i, j), k);
    }
}
