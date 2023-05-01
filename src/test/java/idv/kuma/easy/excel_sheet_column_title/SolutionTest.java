package idv.kuma.easy.excel_sheet_column_title;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    private final Solution sut = new Solution();

    @Test
    public void _1_A() {

        Assertions.assertThat(sut.convertToTitle(1)).isEqualTo("A");
    }

    @Test
    public void _2_B() {

        Assertions.assertThat(sut.convertToTitle(2)).isEqualTo("B");
    }
}