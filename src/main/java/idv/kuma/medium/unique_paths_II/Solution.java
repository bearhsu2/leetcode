package idv.kuma.medium.unique_paths_II;


class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }


        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = (j == 0 ? 0 : dp[i][j - 1])
                            + (i == 0 ? 0 : dp[i - 1][j]);
                }

            }
        }

        return dp[m - 1][n - 1];

    }
}
