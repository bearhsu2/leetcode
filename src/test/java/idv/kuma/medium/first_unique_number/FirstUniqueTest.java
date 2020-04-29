package idv.kuma.medium.first_unique_number;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueTest {


    public FirstUnique firstUnique;


    @Test
    public void name() {
        List<Integer> aaa = new ArrayList<>();


        aaa.add(3);
        aaa.add(8);

        Integer three = new Integer(3);


        boolean contains = aaa.contains(three);
        System.out.println(contains);

        aaa.remove(three);

        System.out.println("111");

    }


    @Test
    public void name1() {


        firstUnique = new FirstUnique(new int[]{2, 3, 5});
        checkShowFirstUniqueEquals(2); // return 2

        firstUnique.add(5);            // the queue is now [2,3,5,5]
        checkShowFirstUniqueEquals(2);

        firstUnique.add(2);            // the queue is now [2,3,5,5,2]
        checkShowFirstUniqueEquals(3);

        firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
        checkShowFirstUniqueEquals(-1);

    }


    private void checkShowFirstUniqueEquals(int expected) {
        Assert.assertEquals(expected, firstUnique.showFirstUnique());
    }


    @Test
    public void name2() {
        firstUnique = new FirstUnique(new int[]{7, 7, 7, 7, 7, 7});
        checkShowFirstUniqueEquals(-1);

        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
        firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
        checkShowFirstUniqueEquals(17);
    }
}