package idv.kuma.easy.word_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean wordPattern(String patternInput, String stringInput) {

        Map<Character, String> patternToString = new HashMap<>();
        Map<String, Character> stringToPattern = new HashMap<>();

        char[] patterns = getPatterns(patternInput);
        String[] strings = getStrings(stringInput);

        if (patterns.length != strings.length) return false;

        for (int i = 0; i < patterns.length; i++) {

            char pattern = patterns[i];
            String string = strings[i];
            String existingString = patternToString.get(pattern);
            Character existingPattern = stringToPattern.get(string);

            if (stringUnmatch(string, existingString)
                    || patternUnmatch(pattern, existingPattern)) {
                return false;
            }

            patternToString.put(pattern, string);
            stringToPattern.put(string, pattern);
        }

        return true;

    }


    private char[] getPatterns(String patternInput) {
        return patternInput.toCharArray();
    }


    private String[] getStrings(String stringInput) {
        return stringInput.split(" ");
    }


    private boolean stringUnmatch(String string, String existingString) {
        return !Objects.isNull(existingString) && !existingString.equals(string);
    }


    private boolean patternUnmatch(char pattern, Character existingPattern) {
        return !Objects.isNull(existingPattern) && !existingPattern.equals(pattern);
    }
}
