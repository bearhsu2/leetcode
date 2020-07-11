package idv.kuma.easy.valid_sudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {


    public boolean isValidSudoku(char[][] board) {

        Map<Integer, Set<Character>> rowCharsByRowNumber = createNewMap();
        Map<Integer, Set<Character>> colCharsByColNumber = createNewMap();
        Map<Integer, Set<Character>> gridCharsByGridNumber = createNewMap();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if (c != '.') {


                    boolean row = checkOneSet(c, rowCharsByRowNumber.get(i));

                    boolean column = checkOneSet(c, colCharsByColNumber.get(j));


                    int index = i / 3 * 3 + j / 3;
                    boolean grid = checkOneSet(c, gridCharsByGridNumber.get(index));


                    if (!row || !column || !grid) {
                        return false;
                    }

                }

            }
        }


        return true;
    }


    private Map<Integer, Set<Character>> createNewMap() {

        Map<Integer, Set<Character>> result = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            result.put(i, new HashSet<>());
        }

        return result;
    }


    private boolean checkOneSet(char c, Set<Character> chars) {

        if (chars.contains(c)) {
            return false;
        } else {
            chars.add(c);
            return true;
        }

    }


}
