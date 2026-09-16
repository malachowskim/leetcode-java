package p0135_candy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] ratings = {1,0,2};

        int result = solution.candy(ratings);

        assertThat(result).isEqualTo(5);
    }
}