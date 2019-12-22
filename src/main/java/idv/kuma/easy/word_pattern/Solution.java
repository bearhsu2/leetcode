package idv.kuma.easy.word_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean wordPattern(String patternInput, String stringInput) {

        Map<Character, String> patternToString = new HashMap<>();
        Map<String, Character> stringToPattern = new HashMap<>();

        char[] patterns = patternInput.toCharArray();

        String[] strings = stringInput.split(" ");

        if (patterns.length != strings.length) {
            return false;
        }


        for (int i = 0; i < patterns.length; i++) {

            char pattern = patterns[i];
            String string = strings[i];
            String existingString = patternToString.get(pattern);
            Character existingPattern = stringToPattern.get(string);

            if (!Objects.isNull(existingString) && !existingString.equals(string)) {
                return false;
            }

            if (!Objects.isNull(existingPattern) && !existingPattern.equals(pattern)) {
                return false;
            }

            patternToString.put(pattern, string);
            stringToPattern.put(string, pattern);


        }

        return true;

    }
}
