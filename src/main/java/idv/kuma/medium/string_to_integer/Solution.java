package idv.kuma.medium.string_to_integer;

public class Solution {


    public int myAtoi(String str) {

        final int INT_MAX = 2147483647;
        final int INT_MIN = -2147483648;

        if ("".equals(str)){
            return 0;
        }

        char[] chars = str.toCharArray();

        boolean negative = false;
        int index = 0;

        // read out spaces
        while(' ' == chars[index]){
            index++;
        }

        // read + or - sign
        if ('+' == chars[index]){
            negative = false;
            index++;
        } else if ('-' == chars[index]){
            negative = true;
            index++;
        }

        // start reading numbers
        long number = 0L;
        int oldNumber = 0;
        while(index < str.length()){

            char c = chars[index];

            int digit = c - '0';
            if (0 <= digit && digit <= 9){
                number = number * 10 + digit;

                if (INT_MAX < number) {
                    return negative ? INT_MIN : INT_MAX;
                }

            } else {

                return negative ? (int) -number : (int) number;
            }

            index++;


        }

        return negative ? (int) -number : (int) number;
    }



}