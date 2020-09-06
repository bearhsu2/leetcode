package idv.kuma.medium.spiral_matrix_iii;

class Solution {


    public static final int[][] deltas = new int[][]{
            {0, -1},
            {-1, 0},
            {0, 1},
            {1, 0}
    };


    public int[][] spiralMatrixIII(int R, int C, int r, int c) {

        if (R * C == 1) {
            return new int[][]{{0, 0}};
        }

        int[][] answer = new int[R * C][];


        int count = 0;

        int totalCounts = Math.max(R, C) * Math.max(R, C) * 4;
        int dIndex = 2;
        int maxStepsInDirection = 1;
        int currentStepsInDirection = 0;
        int written = 0;
        while (count <= totalCounts) {


            if (0 <= r && r < R
                    && 0 <= c && c < C) {
                answer[written] = new int[]{r, c};
                written++;
            }

            r += deltas[dIndex][0];
            c += deltas[dIndex][1];


            currentStepsInDirection++;

            if (currentStepsInDirection >= maxStepsInDirection) {
                dIndex++;
                dIndex %= 4;
                currentStepsInDirection = 0;

                if (dIndex % 2 == 0) {
                    maxStepsInDirection++;
                }
            }

            count++;
        }


        return answer;
    }
}

