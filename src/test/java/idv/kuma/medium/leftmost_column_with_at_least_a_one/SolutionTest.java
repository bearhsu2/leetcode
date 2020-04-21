package idv.kuma.medium.leftmost_column_with_at_least_a_one;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {


    @Test
    public void name0() {
        BinaryMatrix matrix = new DummyMatrix(new int[][]{
                {0, 0},
                {1, 1}
        });

        Assertions.assertThat(new Solution().leftMostColumnWithOne(matrix))
                .isEqualTo(0);
    }

    @Test
    public void name1() {
        BinaryMatrix matrix = new DummyMatrix(new int[][]{
                {0, 0},
                {0, 1}
        });

        Assertions.assertThat(new Solution().leftMostColumnWithOne(matrix))
                .isEqualTo(1);
    }
}

class DummyMatrix implements BinaryMatrix {

    private int[][] values;
    private int n;
    private int m;


    public DummyMatrix(int[][] values) {

        this.values = values;

        n = values.length;
        m = values[0].length;
    }


    @Override
    public List<Integer> dimensions() {

        return Arrays.asList(n, m);
    }


    @Override
    public int get(int x, int y) {
        return values[x][y];
    }
}