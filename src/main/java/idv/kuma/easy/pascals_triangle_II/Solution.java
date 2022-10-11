package idv.kuma.easy.pascals_triangle_II;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        if (rowIndex == 0) {
            return List.of(1);
        }

        List<Integer> lastRow = new ArrayList<>(1);

        for (int i = 1; i <= rowIndex; i++) {

            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    currentRow.add(lastRow.get(j - 1) + lastRow.get(j));
                }
            }
            lastRow = currentRow;

        }

        return lastRow;
    }
}

