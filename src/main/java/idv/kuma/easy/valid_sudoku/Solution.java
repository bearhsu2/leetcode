package idv.kuma.easy.valid_sudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {


    public boolean isValidSudoku(char[][] board) {
        boolean rows = checkRows(board);

        boolean columns = checkcolumns(board);

        boolean grids = checkGrids(board);

        return rows && columns && grids;
    }


    private boolean checkGrids(char[][] board) {
        for (int i = 0; i < 9; i++) {
            char[] row = board[i];
            if (!checkRow(row)) {
                return false;
            }
        }
        return true;
    }


    private boolean checkRow(char[] row) {

        return false;
    }


    private boolean checkcolumns(char[][] board) {
        return false;
    }


    private boolean checkRows(char[][] board) {
        return false;
    }

}
