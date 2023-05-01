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

    @Test
    public void _26_Z() {
        Assertions.assertThat(sut.convertToTitle(26)).isEqualTo("Z");
    }

    @Test
    public void _27_AA() {
        Assertions.assertThat(sut.convertToTitle(27)).isEqualTo("AA");
    }

    @Test
    public void _28_AB() {
        Assertions.assertThat(sut.convertToTitle(28)).isEqualTo("AB");
    }

    @Test
    public void _52_AZ() {
        Assertions.assertThat(sut.convertToTitle(52)).isEqualTo("AZ");
    }

    @Test
    public void _53_BA() {
        Assertions.assertThat(sut.convertToTitle(53)).isEqualTo("BA");
    }

    @Test
    public void _702_ZZ() {
        Assertions.assertThat(sut.convertToTitle(702)).isEqualTo("ZZ");
    }
}