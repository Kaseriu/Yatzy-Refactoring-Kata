import org.junit.*;

import static org.junit.Assert.*;

public class YatzyTest {

    @Test
    public void chance() {
        assertEquals(15, Yatzy.chance(2, 3, 4, 5, 1));
        assertEquals(16, Yatzy.chance(3, 3, 4, 5, 1));
    }

    @Test
    public void yatzy() {
        assertEquals(50, Yatzy.yatzy(4, 4, 4, 4, 4));
        assertEquals(50, Yatzy.yatzy(6, 6, 6, 6, 6));
        assertEquals(0, Yatzy.yatzy(6, 6, 6, 6, 3));
    }

    @Test
    public void placed_on_ones() {
        assertEquals(1, Yatzy.placed_on(1, 1, 2, 3, 4, 5));
        assertEquals(2, Yatzy.placed_on(1,1, 2, 1, 4, 5));
        assertEquals(0, Yatzy.placed_on(1,6, 2, 2, 4, 5));
        assertEquals(4, Yatzy.placed_on(1,1, 2, 1, 1, 1));
    }

    @Test
    public void placed_on_twos() {
        assertEquals(4, Yatzy.placed_on(2,1, 2, 3, 2, 6));
        assertEquals(10, Yatzy.placed_on(2,2, 2, 2, 2, 2));
    }

    @Test
    public void placed_on_threes() {
        assertEquals(6, Yatzy.placed_on(3,1, 2, 3, 2, 3));
        assertEquals(12, Yatzy.placed_on(3,2, 3, 3, 3, 3));
    }

    @Test
    public void placed_on_fours() {
        assertEquals(12, Yatzy.placed_on(4,4, 4, 4, 5, 5));
        assertEquals(8, Yatzy.placed_on(4,4, 4, 5, 5, 5));
        assertEquals(4, Yatzy.placed_on(4,4, 5, 5, 5, 5));
    }

    @Test
    public void placed_on_fives() {
        assertEquals(10, Yatzy.placed_on(5,4, 4, 4, 5, 5));
        assertEquals(15, Yatzy.placed_on(5,4, 4, 5, 5, 5));
        assertEquals(20, Yatzy.placed_on(5,4, 5, 5, 5, 5));
    }

    @Test
    public void placed_on_sixes() {
        assertEquals(0, Yatzy.placed_on(6,4, 4, 4, 5, 5));
        assertEquals(6, Yatzy.placed_on(6,4, 4, 6, 5, 5));
        assertEquals(18, Yatzy.placed_on(6,6, 5, 6, 6, 5));
    }

    @Test
    public void one_pair() {
        assertEquals(6, Yatzy.score_pair(3, 4, 3, 5, 6));
        assertEquals(10, Yatzy.score_pair(5, 3, 3, 3, 5));
        assertEquals(12, Yatzy.score_pair(5, 3, 6, 6, 5));
    }

    @Test
    public void two_Pair() {
        assertEquals(16, Yatzy.score_two_pairs(3, 3, 5, 4, 5));
        assertEquals(16, Yatzy.score_two_pairs(3, 3, 5, 5, 5));
    }

    @Test
    public void three_of_a_kind() {
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 4, 5));
        assertEquals(15, Yatzy.three_of_a_kind(5, 3, 5, 4, 5));
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 5));
    }

    @Test
    public void four_of_a_kind() {
        assertEquals(12, Yatzy.four_of_a_kind(3, 3, 3, 3, 5));
        assertEquals(20, Yatzy.four_of_a_kind(5, 5, 5, 4, 5));
        assertEquals(12, Yatzy.four_of_a_kind(3, 3, 3, 3, 3));
    }

    @Test
    public void small_straight() {
        assertEquals(15, Yatzy.smallStraight(1, 2, 3, 4, 5));
        assertEquals(15, Yatzy.smallStraight(2, 3, 4, 5, 1));
        assertEquals(0, Yatzy.smallStraight(1, 2, 2, 4, 5));
    }

    @Test
    public void large_straight() {
        assertEquals(20, Yatzy.largeStraight(6, 2, 3, 4, 5));
        assertEquals(20, Yatzy.largeStraight(2, 3, 4, 5, 6));
        assertEquals(0, Yatzy.largeStraight(1, 2, 2, 4, 5));
    }

    @Test
    public void full_house() {
        assertEquals(18, Yatzy.fullHouse(6, 2, 2, 2, 6));
        assertEquals(0, Yatzy.fullHouse(2, 3, 4, 5, 6));
    }
}
