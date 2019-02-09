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

        this.s = sIn;
        this.value = 0;


        process("C", 100);

        process("XC", 90);
        process("L", 50);
        process("XL", 40);
        process("XXX", 30);
        process("XX", 20);
        process("X", 10);

        process("IX", 9);
        process("V", 5);
        process("IV", 4);
        process("III", 3);
        process("II", 2);
        process("I", 1);


        return value;
    }

    private void process(String symbols, int delta) {
        if (s.startsWith(symbols)) {
            value += delta;
            s = s.replaceFirst(symbols, "");
        }
    }
}