package p0399_evaluate_division;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        List<List<String>> equations = List.of(
                List.of("a", "b"),
                List.of("b", "c")
        );
        double[] values = {2.0, 3.0};
        List<List<String>> queries = List.of(
                List.of("a", "c"),
                List.of("b", "a"),
                List.of("a", "e"),
                List.of("a", "a"),
                List.of("x", "x")
        );

        double[] result = solution.calcEquation(equations, values, queries);

        assertThat(result).containsExactly(6.0, 0.5, -1.0, 1.0, -1.0);
    }

    @Test
    void test2() {
        List<List<String>> equations = List.of(
                List.of("x1", "x2"),
                List.of("x2", "x3"),
                List.of("x3", "x4"),
                List.of("x4", "x5")
        );
        double[] values = {3.0, 4.0, 5.0, 6.0};
        List<List<String>> queries = List.of(
                List.of("x1", "x5"),
                List.of("x5", "x2"),
                List.of("x2", "x4"),
                List.of("x2", "x2"),
                List.of("x2", "x9"),
                List.of("x9", "x9")
        );

        double[] result = solution.calcEquation(equations, values, queries);

        assertThat(result).containsExactly(360.0, 0.008333333333333333, 20.0, 1.0, -1.0, -1.0);
    }
}