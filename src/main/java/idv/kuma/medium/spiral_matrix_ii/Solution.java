package idv.kuma.medium.spiral_matrix_ii;

public class Solution {


    public static int[][] deltas = new int[][]{
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };


    public int[][] generateMatrix(int n) {

        int[][] answer = new int[n][n];

        int i = 0;
        int j = 0;

        int dIndex = 0;

        int currentValue = 1;
        int targetValue = n * n;
        while (currentValue <= targetValue) {

            answer[i][j] = currentValue;

            dIndex = findNextDIndex(n, answer, i + deltas[dIndex][0], j + deltas[dIndex][1], dIndex);

            i += deltas[dIndex][0];
            j += deltas[dIndex][1];
            currentValue++;
        }


        return answer;
    }


    private int findNextDIndex(int n, int[][] answer, int nextI1, int nextJ1, int dIndex) {
        int nextI = nextI1;
        int nextJ = nextJ1;

        if (nextI < 0 || nextI >= n
                || nextJ < 0 || nextJ >= n
                || answer[nextI][nextJ] != 0) {
            dIndex++;
            dIndex %= 4;
        }
        return dIndex;
    }
}
