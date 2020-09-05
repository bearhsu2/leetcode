package idv.kuma.medium.spiral_matrix_ii;

public class Solution {


    public static int[][] deltas = new int[][]{
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };
    public int nextI;


    public int[][] generateMatrix(int n) {

        int[][] answer = new int[n][n];

        int i = 0;
        int j = 0;

        int dIndex = 0;

        int currentValue = 1;
        int targetValue = n * n;
        while (currentValue <= targetValue) {

            answer[i][j] = currentValue;

            int nextI = i + deltas[dIndex][0];
            int nextJ = j + deltas[dIndex][1];

            if (nextI < 0 || nextI >= n
                    || nextJ < 0 || nextJ >= n
                    || answer[nextI][nextJ] != 0) {
                dIndex++;
                dIndex %= 4;
            }

            i += deltas[dIndex][0];
            j += deltas[dIndex][1];
            currentValue++;
        }


        return answer;
    }
}
