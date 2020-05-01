package idv.kuma.easy.rotate_image;

public class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {

                //store the value at i,j th position
                int copy = matrix[i][j];

                //according to the formula mentioned above perform swaps
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = copy;

            }


        }


    }
}
