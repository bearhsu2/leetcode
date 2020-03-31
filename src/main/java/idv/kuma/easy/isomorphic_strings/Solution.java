package idv.kuma.easy.isomorphic_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public boolean isIsomorphic(String sInput, String tInput) {

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tTos = new HashMap<>();

        char[] sChars = sInput.toCharArray();
        char[] tChars = tInput.toCharArray();

        if (sChars.length != tChars.length) {
            return false;
        }

        for (int i = 0; i < sChars.length; i++) {

            char s = sChars[i];
            char t = tChars[i];

            Character existingT = sToT.get(s);
            Character existingS = tTos.get(t);

            if (!Objects.isNull(existingT) && !existingT.equals(t)
                    || !Objects.isNull(existingS) && !existingS.equals(s)) {
                return false;
            }

            sToT.put(s, t);
            tTos.put(t, s);

        }


        return true;
    }
}
