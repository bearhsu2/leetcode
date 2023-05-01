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
            char result = (char) (base + diff);
            return String.valueOf(result);
        } else {
            return "AA";
        }


    }
}
