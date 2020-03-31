package idv.kuma.easy.greatest_common_divisor_of_strings;

public class Solution {

    public String gcdOfStrings(String str1, String str2) {

        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 < length2) {
            return gcdOfStrings(str2, str1);
        }

        if (str1.equals(str2)) {
            return str1;
        }

        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(length2), str2);
        }

        return "";
    }
}
