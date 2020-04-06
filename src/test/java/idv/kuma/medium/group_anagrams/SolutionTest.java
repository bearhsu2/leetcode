package idv.kuma.medium.group_anagrams;

import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void _eat_tea_tan_ate_nat_bat() {

        List<List<String>> lists =
                new Solution()
                        .groupAnagrams(
                                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});


        System.out.println(lists);

    }


    @Test
    public void _boo_bob() {

        List<List<String>> lists =
                new Solution()
                        .groupAnagrams(
                                new String[]{"boo", "bob"});
        System.out.println(lists);

    }


    @Test
    public void _zero_elements() {

        List<List<String>> lists =
                new Solution()
                        .groupAnagrams(
                                new String[]{});


        System.out.println(lists);

    }
}