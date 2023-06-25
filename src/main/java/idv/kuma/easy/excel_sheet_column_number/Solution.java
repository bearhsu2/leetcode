package idv.kuma.easy.excel_sheet_column_number;

public class Solution {

    private final char base = 'A' - 1;

    public int titleToNumber(String columnTitle) {

        char[] charArray = columnTitle.toCharArray();

        int result = 0;
        for (char c : charArray) {

            int diff = c - base;

            result = result * 26 + diff;

        }

        return result;
    }
}
