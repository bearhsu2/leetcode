package idv.kuma.medium.first_unique_number;

import java.util.ArrayDeque;
import java.util.Queue;

class FirstUnique {

    Queue<Integer> uniqueNumbers;



    public FirstUnique(int[] nums) {

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
