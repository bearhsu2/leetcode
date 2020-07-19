package idv.kuma.easy.string_to_integer_atoi;

class Solution {
    public int myAtoi(String str) {

        String trimmed = str.trim();

        String numbers[] = trimmed.split(" ");


        Long longValue = null;
        try {
            longValue = Long.valueOf(numbers[0]);
        } catch (NumberFormatException e) {
            return 0;
        }


        return longValue.intValue();

    }
}