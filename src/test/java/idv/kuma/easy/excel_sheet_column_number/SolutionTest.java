package idv.kuma.easy.excel_sheet_column_number;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void A_1() {

        int actual = new Solution().titleToNumber("A");
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    public void AB_28() {

        int actual = new Solution().titleToNumber("AB");
        Assertions.assertThat(actual).isEqualTo(28);
    }

    @Test
    public void ZY_701() {

        int actual = new Solution().titleToNumber("ZY");
        Assertions.assertThat(actual).isEqualTo(701);
    }
}