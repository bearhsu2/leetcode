package idv.kuma.easy.add_binary;

public class Solution {
    public String addBinary(String a, String b) {

        if (a.equals("0") && b.equals("0")) {
            return "0";
        }

        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        String result = "";
        int carry = 0;
        while (a.length() > 0 && b.length() > 0) {

            int aInt = a.length() > 0
                    ? Character.getNumericValue(a.charAt(a.length() - 1))
                    : 0;

            int bInt = b.length() > 0
                    ? Character.getNumericValue(b.charAt(b.length() - 1))
                    : 0;

            int value = carry + aInt + bInt;

            if (value == 1) {
                result = 1 + result;
                carry = 0;
            } else if (value == 2) {
                result = 0 + result;
                carry = 1;
            } else if (value == 3) {
                result = 1 + result;
                carry = 1;
            } else { // value == 0
                result = 0 + result;
                carry = 0;
            }


            if (a.length() > 0) {
                a = a.substring(0, a.length() - 1);
            }
            if (b.length() > 0) {
                b = b.substring(0, b.length() - 1);
            }
        }

        if (carry == 1) {
            result = 1 + result;
        }

        return result;
    }

}