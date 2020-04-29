package idv.kuma.medium.first_unique_number;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

class FirstUnique {


    Set<Integer> appearedNumbers;
    Queue<Integer> uniqueNumbers;


    public FirstUnique(int[] nums) {

        this.appearedNumbers = new HashSet<>();
        this.uniqueNumbers = new ArrayDeque<>();

        for (int num : nums) {
            add(num);
        }

    }


    public void add(int value) {

        Integer object = new Integer(value);
        if (appearedNumbers.contains(object)) {

            if (uniqueNumbers.contains(object)) {
                uniqueNumbers.remove(object);
            }

        } else {
            appearedNumbers.add(object);
            uniqueNumbers.add(object);
        }

    }


    public int showFirstUnique() {


        try {
            return uniqueNumbers.peek();
        } catch (NullPointerException e) {
            return -1;
        }

    }
}
