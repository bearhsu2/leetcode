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

        StringBuilder resultStr = new StringBuilder();


        while (columnNumber > 0) {

            columnNumber -= 1;

            int offset = columnNumber % 26;

            resultStr.insert(0, getOneChar(offset));

            columnNumber = columnNumber / 26;
        }

        return resultStr.toString();


    }

    private char getOneChar(int diff) {
        return (char) (base + diff);
    }
}
