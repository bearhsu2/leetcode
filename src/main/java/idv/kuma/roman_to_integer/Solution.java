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

    String s = "";
    int value;


    public int romanToInt(String sIn) {

        if (sIn.length() == 1) return symbolToValue.get(sIn);

        this.s = sIn;
        this.value = 0;

        process("III", 3);

        process("II", 2);


        return value;
    }

    private void process(String symbols, int delta) {
        if (s.startsWith(symbols)) {
            value += delta;
            s = s.replaceFirst(symbols, "");
        }
    }
}