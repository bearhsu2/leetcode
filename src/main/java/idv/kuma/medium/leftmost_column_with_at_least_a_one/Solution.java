package idv.kuma.medium.leftmost_column_with_at_least_a_one;

import java.util.List;

public class Solution {
    // binary search


    /**
     * // This is the BinaryMatrix's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface BinaryMatrix {
     * public int get(int x, int y) {}
     * public List<Integer> dimensions {}
     * };
     */


    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {

        List<Integer> dimensions = binaryMatrix.dimensions();
        int n = dimensions.get(0);
        int m = dimensions.get(1);

        int i = 0;
        int j = m - 1;
        int result = -1;

        while (i >= 0 && i < n && j >= 0 && j < m) {

            int value = binaryMatrix.get(i, j);

            if (value == 1) {
                result = j;
                j--; // move left
            } else {
                i++; // move down
            }

        }

        return result;
    }

}