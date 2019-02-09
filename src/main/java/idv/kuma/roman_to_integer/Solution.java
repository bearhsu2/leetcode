package idv.kuma.roman_to_integer;


public class Solution {

    private String s = "";
    private int value;


    public int romanToInt(String sIn) {

        this.s = sIn;
        this.value = 0;

        process("MMM", 3000);
        process("MM", 2000);
        process("M", 1000);

        process("CM", 900);
        process("D", 500);
        process("CD", 400);
        process("CCC", 300);
        process("CC", 200);
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