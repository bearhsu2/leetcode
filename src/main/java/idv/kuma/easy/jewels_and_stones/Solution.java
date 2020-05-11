package idv.kuma.easy.jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String J, String S) {

        Set<Character> jewels = getHash(J);


        int sum = 0;
        for (char c : S.toCharArray()) {

            if (jewels.contains(c)) {
                sum++;
            }

        }

        return sum;

    }


    private Set<Character> getHash(String j) {


        Set<Character> set = new HashSet<>();
        for (char c : j.toCharArray()) {
            set.add(c);
        }

        return set;
    }
}
