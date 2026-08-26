package p0380_insert_delete_getrandom_o_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomizedSetTest {

    private final RandomizedSet randomizedSet = new RandomizedSet();

    @Test
    void test1() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertThat(randomizedSet.insert(1)).isTrue();
        assertThat(randomizedSet.remove(2)).isFalse();
        assertThat(randomizedSet.insert(2)).isTrue();
        assertThat(randomizedSet.getRandom()).isIn(1, 2);
        assertThat(randomizedSet.remove(1)).isTrue();
        assertThat(randomizedSet.insert(2)).isFalse();
        assertThat(randomizedSet.getRandom()).isEqualTo(2);
    }
}