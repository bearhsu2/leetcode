package idv.kuma.easy.pascals_triangle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void _5() {

        List<List<Integer>> actual = new Solution().generate(5);

        List<List<Integer>> expected = new ArrayList<>(
                Arrays.asList(
                        makeIntegerList(1),
                        makeIntegerList(1, 1),
                        makeIntegerList(1, 2, 1),
                        makeIntegerList(1, 3, 3, 1),
                        makeIntegerList(1, 4, 6, 4, 1)
                )
        );

        Assertions.assertThat(actual).isEqualTo(expected);
    }


    private List<Integer> makeIntegerList(int... ints) {

        List<Integer> result = new ArrayList<>();

        for (int anInt : ints) {
            result.add(anInt);
        }

        return result;

    }
}