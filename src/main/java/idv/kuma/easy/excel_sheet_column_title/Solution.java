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

        int diff = columnNumber - 1; // 'A' maps to 1


        String resultStr = "";
        if (diff < 26) {
            char currChar = getOneChar(diff);
            resultStr += currChar;
        } else {

            int howMany26s = diff / 26;

            char oneChar = getOneChar(howMany26s - 1);

            resultStr += oneChar;
            diff %= 26;
            
            char currChar = getOneChar(diff);
            resultStr += currChar;
        }

        return resultStr;


    }

    private char getOneChar(int diff) {
        return (char) (base + diff);
    }
}
