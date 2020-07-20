package idv.kuma.easy.string_to_integer_atoi;

class Solution {
    public int myAtoi(String str) {

        String trimmed = str.trim();

        if (trimmed.length() <= 0) {
            return 0;
        }

        char[] chars = trimmed.toCharArray();

        long longValue = 0L;

        int sign = 1;
        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];

            if (c == '-' && i == 0) {
                sign = -1;
            } else if (c == '+' && i == 0) {
                sign = 1;
            } else if (c >= '0' && c <= '9') {
                longValue = longValue * 10 + (c - '0');

                if (longValue * sign >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }

                if (longValue * sign <= Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

            } else {
                break;
            }
        }


        return sign * (int) longValue;
    }

}