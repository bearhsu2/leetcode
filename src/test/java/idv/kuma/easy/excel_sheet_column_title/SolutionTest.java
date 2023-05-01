package idv.kuma.easy.excel_sheet_column_title;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _1_A() {

        Solution sut = new Solution();

        String actual = sut.convertToTitle(1);

        Assertions.assertThat(actual).isEqualTo("A");
    }

    @Test
    public void _2_B() {

        Solution sut = new Solution();

        String actual = sut.convertToTitle(2);

        Assertions.assertThat(actual).isEqualTo("B");
    }
}