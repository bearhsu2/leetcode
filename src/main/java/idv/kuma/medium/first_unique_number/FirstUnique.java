package idv.kuma.medium.first_unique_number;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

class FirstUnique {


    Map<Integer, Integer> appearedNumbers;
    Queue<Integer> uniqueNumbers;



    public FirstUnique(int[] nums) {

        this.appearedNumbers = new HashMap<>();
        this.uniqueNumbers = new ArrayDeque<>();

        for (int num : nums) {
            add(num);
        }

    }

    public int showFirstUnique() {

        return -1;
    }

    public void add(int value) {

    }
}
