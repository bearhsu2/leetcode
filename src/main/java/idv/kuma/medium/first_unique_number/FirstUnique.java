package idv.kuma.medium.first_unique_number;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class FirstUnique {

    Set<Integer> appearedNumbers;
    Set<Integer> uniqueNumbers;


    public FirstUnique(int[] nums) {

        this.appearedNumbers = new HashSet<>();
        this.uniqueNumbers = new LinkedHashSet<>();

        for (int num : nums) {
            add(num);
        }

    }


    public void add(int value) {

        Integer object = value;
        if (appearedNumbers.contains(object)) {

            uniqueNumbers.remove(object);

        } else {
            appearedNumbers.add(object);
            uniqueNumbers.add(object);
        }

    }


    public int showFirstUnique() {

        Iterator<Integer> iterator = uniqueNumbers.iterator();

        return iterator.hasNext()
                ? iterator.next()
                : -1;
    }
}
