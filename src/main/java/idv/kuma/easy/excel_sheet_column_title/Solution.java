package idv.kuma.easy.excel_sheet_column_title;

//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...
class Solution {

    private final char base = 'A';

    public String convertToTitle(int columnNumber) {

        String resultStr = "";


        while (columnNumber > 0) {
            int diff = columnNumber - 1;
            int shift = diff % 26;

            resultStr = getOneChar(shift) + resultStr;

            columnNumber = (diff - shift) / 26;
        }

        return resultStr;


    }

    private char getOneChar(int diff) {
        return (char) (base + diff);
    }
}
