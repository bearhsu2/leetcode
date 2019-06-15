package idv.kuma.medium.integer_to_roman;

public class Solution {


    private StringBuilder sb;
    private int num;

    public String intToRoman(int numIn) {

        sb = new StringBuilder();
        num = numIn;

        process(3000, "MMM");
        process(2000, "MM");
        process(1000, "M");

        process(900, "CM");
        process(500, "D");
        process(400, "CD");
        process(300, "CCC");
        process(200, "CC");
        process(100, "C");

        process(90, "XC");
        process(50, "L");
        process(40, "XL");
        process(30, "XXX");
        process(20, "XX");
        process(10, "X");

        process(9, "IX");
        process(5, "V");
        process(4, "IV");
        process(3, "III");
        process(2, "II");
        process(1, "I");


        return sb.toString();

    }

    private void process(int checkValue, String symbol) {
        if (num >= checkValue) {
            sb.append(symbol);
            num -= checkValue;
        }
    }
}