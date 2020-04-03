package idv.kuma.easy.add_binary;

public class Solution {
    public String addBinary(String a, String b) {

        if (a.equals("0") && b.equals("0")) {
            return "0";
        }


        Integer aInt = Integer.valueOf(a);
        Integer bInt = Integer.valueOf(b);

        int temp = aInt + bInt;

        String result = "";

        int carry = 0;
        while (temp > 0) {
            int value = carry + temp % 10;
            temp /= 10;

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

        }

        if (carry == 1) {
            result = 1 + result;
        }


        return result;
    }

}