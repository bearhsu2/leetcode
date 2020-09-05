package idv.kuma.medium.spirial_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[][] deltas = new int[][]{
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };


    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> answer = new ArrayList<>();

        int w = matrix.length;
        int h = matrix[0].length;

        boolean[][] footprint = new boolean[w][h];


        int i = 0;
        int j = 0;

        int count = 0;

        int total = w * h;
        int dIndex = 0;
        while (count < total) {
            answer.add(matrix[i][j]);
            footprint[i][j] = true;

            dIndex = findNextDIndex(w, h, footprint, i, j, dIndex);

            i = i + deltas[dIndex][0];
            j = j + deltas[dIndex][1];
            count++;

        }


        return answer;

    }


    private int findNextDIndex(int w, int h, boolean[][] footprint, int i, int j, int dIndex) {
        int nextI = i + deltas[dIndex][0];
        int nextJ = j + deltas[dIndex][1];

        if (nextI < 0 || nextI >= w
                || nextJ < 0 || nextJ >= h
                || footprint[nextI][nextJ]) {
            dIndex++;
            dIndex %= 4;
        }
        return dIndex;
    }
}
