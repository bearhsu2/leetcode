package idv.kuma.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    static Map<String, Integer> symbolToValue = new HashMap<>();

    static {
        symbolToValue.put("I", 1);
        symbolToValue.put("V", 5);
        symbolToValue.put("X", 10);
        symbolToValue.put("L", 50);
        symbolToValue.put("C", 100);
        symbolToValue.put("D", 500);
        symbolToValue.put("M", 1000);
    }


    public int romanToInt(String s) {

        if (s.length() == 1) return symbolToValue.get(s);

        int value = 0;


        if (s.startsWith("III")) {
            value += 3;
            s = s.replaceFirst("III", "");
        }

        if (s.startsWith("II")) {
            value += 2;
            s = s.replaceFirst("II", "");
        }


        return value;
    }
}