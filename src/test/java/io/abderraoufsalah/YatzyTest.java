package io.abderraoufsalah;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class YatzyTest {

    @Test
    void chance() {
        assertEquals(14, Yatzy.chance(1, 1, 3, 3, 6));
        assertEquals(15, Yatzy.chance(2, 3, 4, 5, 1));
        assertEquals(16, Yatzy.chance(3, 3, 4, 5, 1));
        assertEquals(21, Yatzy.chance(4, 5, 5, 6, 1));
    }

    @Test
    void yatzy() {
        assertEquals(0, Yatzy.yatzy(1, 1, 1, 2, 1));
        assertEquals(0, Yatzy.yatzy(6, 6, 6, 6, 3));
        assertEquals(50, Yatzy.yatzy(1, 1, 1, 1, 1));
        assertEquals(50, Yatzy.yatzy(4, 4, 4, 4, 4));
        assertEquals(50, Yatzy.yatzy(6, 6, 6, 6, 6));
    }

    @Test
    void ones() {
        assertEquals(0, Yatzy.ones(3, 3, 3, 4, 5));
        assertEquals(0, Yatzy.ones(6, 2, 2, 4, 5));
        assertEquals(1, Yatzy.ones(1, 2, 3, 4, 5));
        assertEquals(1, Yatzy.ones(2, 3, 2, 5, 1));
        assertEquals(2, Yatzy.ones(1, 1, 2, 4, 4));
        assertEquals(2, Yatzy.ones(1, 2, 1, 4, 5));
        assertEquals(4, Yatzy.ones(1, 2, 1, 1, 1));
    }

    @Test
    void twos() {
        assertEquals(0, Yatzy.twos(3, 3, 3, 4, 5));
        assertEquals(2, Yatzy.twos(1, 1, 2, 4, 4));
        assertEquals(4, Yatzy.twos(1, 2, 3, 2, 6));
        assertEquals(4, Yatzy.twos(2, 3, 2, 5, 1));
        assertEquals(10, Yatzy.twos(2, 2, 2, 2, 2));
    }

    @Test
    void threes() {
        assertEquals(0, Yatzy.threes(1, 1, 2, 4, 4));
        assertEquals(3, Yatzy.threes(2, 3, 2, 5, 1));
        assertEquals(6, Yatzy.threes(1, 2, 3, 2, 3));
        assertEquals(9, Yatzy.threes(3, 3, 3, 4, 5));
        assertEquals(12, Yatzy.threes(2, 3, 3, 3, 3));
    }

    @Test
    void fours() {
        assertEquals(0, new Yatzy(2, 3, 2, 5, 1).fours());
        assertEquals(4, new Yatzy(3, 3, 3, 4, 5).fours());
        assertEquals(4, new Yatzy(4, 5, 5, 5, 5).fours());
        assertEquals(8, new Yatzy(1, 1, 2, 4, 4).fours());
        assertEquals(8, new Yatzy(4, 4, 5, 5, 5).fours());
        assertEquals(12, new Yatzy(4, 4, 4, 5, 5).fours());
    }

    @Test
    void fives() {
        assertEquals(0, new Yatzy(1, 1, 2, 4, 4).fives());
        assertEquals(5, new Yatzy(2, 3, 2, 5, 1).fives());
        assertEquals(5, new Yatzy(3, 3, 3, 4, 5).fives());
        assertEquals(10, new Yatzy(4, 4, 4, 5, 5).fives());
        assertEquals(15, new Yatzy(4, 4, 5, 5, 5).fives());
        assertEquals(20, new Yatzy(4, 5, 5, 5, 5).fives());
    }

    @Test
    void sixes() {
        assertEquals(0, new Yatzy(1, 1, 2, 4, 4).sixes());
        assertEquals(0, new Yatzy(2, 3, 2, 5, 1).sixes());
        assertEquals(0, new Yatzy(3, 3, 3, 4, 5).sixes());
        assertEquals(0, new Yatzy(4, 4, 4, 5, 5).sixes());
        assertEquals(6, new Yatzy(4, 4, 6, 5, 5).sixes());
        assertEquals(18, new Yatzy(6, 5, 6, 6, 5).sixes());
    }

    @Test
    void pair() {
        assertEquals(0, Yatzy.score_pair(1, 2, 3, 4, 5));
        assertEquals(6, Yatzy.score_pair(3, 3, 3, 3, 1));
        assertEquals(6, Yatzy.score_pair(3, 3, 3, 4, 1));
        assertEquals(6, Yatzy.score_pair(3, 4, 3, 5, 6));
        assertEquals(8, Yatzy.score_pair(3, 3, 3, 4, 4));
        assertEquals(10, Yatzy.score_pair(5, 3, 3, 3, 5));
        assertEquals(12, Yatzy.score_pair(1, 1, 6, 2, 6));
        assertEquals(12, Yatzy.score_pair(5, 3, 6, 6, 5));
    }

    @Test
    void twoPair() {
        assertEquals(0, Yatzy.two_pair(1, 1, 2, 3, 4));
        assertEquals(0, Yatzy.two_pair(3, 3, 3, 3, 1));
        assertEquals(6, Yatzy.two_pair(1, 1, 2, 2, 2));
        assertEquals(8, Yatzy.two_pair(1, 1, 2, 3, 3));
        assertEquals(16, Yatzy.two_pair(3, 3, 5, 4, 5));
        assertEquals(16, Yatzy.two_pair(3, 3, 5, 5, 5));
    }

    @Test
    void threeOfAKind() {
        assertEquals(0, Yatzy.three_of_a_kind(3, 3, 4, 5, 6));
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 1));
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 3));
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 5));
        assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 4, 5));
        assertEquals(15, Yatzy.three_of_a_kind(5, 3, 5, 4, 5));
    }

    @Test
    void fourOfAKind() {
        assertEquals(0, Yatzy.four_of_a_kind(2, 2, 2, 5, 5));
        assertEquals(8, Yatzy.four_of_a_kind(2, 2, 2, 2, 2));
        assertEquals(8, Yatzy.four_of_a_kind(2, 2, 2, 2, 5));
        assertEquals(12, Yatzy.four_of_a_kind(3, 3, 3, 3, 5));
        assertEquals(20, Yatzy.four_of_a_kind(5, 5, 5, 4, 5));
    }

    @Test
    void smallStraight() {
        assertEquals(0, Yatzy.smallStraight(1, 2, 2, 4, 5));
        assertEquals(15, Yatzy.smallStraight(1, 2, 3, 4, 5));
        assertEquals(15, Yatzy.smallStraight(2, 3, 4, 5, 1));
    }

    @Test
    void largeStraight() {
        assertEquals(0, Yatzy.largeStraight(1, 2, 2, 4, 5));
        assertEquals(20, Yatzy.largeStraight(2, 3, 4, 5, 6));
        assertEquals(20, Yatzy.largeStraight(6, 2, 3, 4, 5));
    }

    @Test
    void fullHouse() {
        assertEquals(0, Yatzy.fullHouse(2, 2, 3, 3, 4));
        assertEquals(0, Yatzy.fullHouse(2, 3, 4, 5, 6));
        assertEquals(0, Yatzy.fullHouse(4, 4, 4, 4, 4));
        assertEquals(8, Yatzy.fullHouse(1, 1, 2, 2, 2));
        assertEquals(18, Yatzy.fullHouse(6, 2, 2, 2, 6));
    }
}