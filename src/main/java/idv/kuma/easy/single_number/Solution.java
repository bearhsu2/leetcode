package idv.kuma.easy.single_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Boolean> numberToBitwise = new HashMap();

        for (int num : nums) {

            Boolean booleanValue = numberToBitwise.get(num);

            if (booleanValue == null) {
                numberToBitwise.put(num, false);
            } else {
                numberToBitwise.put(num, !booleanValue);
            }

        }

        for (Map.Entry<Integer, Boolean> entry : numberToBitwise.entrySet()) {
            if (!entry.getValue()) {
                return entry.getKey();
            }
        }

        return -1;

    }
}

