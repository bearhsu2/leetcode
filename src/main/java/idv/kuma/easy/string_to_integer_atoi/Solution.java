package idv.kuma.easy.string_to_integer_atoi;

import java.math.BigInteger;

class Solution {
    public int myAtoi(String str) {

        String trimmed = str.trim();

        if (trimmed.length() <= 0) {
            return 0;
        }

        String numbers[] = trimmed.split("[^0-9]");


        BigInteger bigValue = null;
        try {


            if (numbers.length <= 0) {
                return 0;
            }

            if (numbers.length >= 2 && "".equalsIgnoreCase(numbers[0])) {

                int sign = 0;
                if (trimmed.charAt(0) == '-') {
                    sign = -1;
                } else if (trimmed.charAt(0) == '+') {
                    sign = 1;
                }

                bigValue = new BigInteger(numbers[1])
                        .multiply(new BigInteger(String.valueOf(sign)));

            } else {
                bigValue = new BigInteger(numbers[0]);
            }


            if (bigValue.compareTo(new BigInteger("" + Integer.MIN_VALUE)) < 0) {
                return Integer.MIN_VALUE;
            }
            if (bigValue.compareTo(new BigInteger("" + Integer.MAX_VALUE)) > 0) {
                return Integer.MAX_VALUE;
            }

        } catch (NumberFormatException e) {
            return 0;
        }


        return bigValue.intValue();

    }
}