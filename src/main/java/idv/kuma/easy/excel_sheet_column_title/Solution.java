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
    public String convertToTitle(int columnNumber) {

        char base = 'A';
        int diff = columnNumber - 1; // 'A' maps to 1


        if (diff < 26) {
            String resultStr = "";
            char currChar = (char) (base + diff);
            return resultStr + currChar;
        } else {

            String resultStr = "";

            resultStr += "A";
            diff -= 26;

            char currChar = (char) (base + diff);

            return resultStr + currChar;
        }


    }
}
