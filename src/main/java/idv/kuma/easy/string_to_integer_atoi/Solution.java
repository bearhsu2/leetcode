package idv.kuma.easy.string_to_integer_atoi;

class Solution {
    public int myAtoi(String str) {

        String trimmed = str.trim();


        Long longValue = Long.valueOf(trimmed);


        return longValue.intValue();

    }
}