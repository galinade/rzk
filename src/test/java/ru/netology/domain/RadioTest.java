package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void soundMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-5);
        int actual1 = cond.getCurrentVolume();
        int expected1 = 0;
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void sound() {
        Radio cond = new Radio();
        cond.setCurrentVolume(2);
        int actual1 = cond.getCurrentVolume();
        int expected1 = 2;
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void numberMax1() {
        Radio cond = new Radio();
        cond.setCurrentNumber(10);
        int actual2 = cond.getCurrentNumber();
        int expected2 = 0;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void numberMin1() {
        Radio cond = new Radio();
        cond.setCurrentNumber(-1);
        int actual2 = cond.getCurrentNumber();
        int expected2 = 0;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void number() {
        Radio cond = new Radio();
        cond.setCurrentNumber(3);
        int actual2 = cond.getCurrentNumber();
        int expected2 = 3;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void numberNext() {
        Radio cond = new Radio();
        cond.setCurrentNumber(8);

        cond.next();

        int actual2 = cond.getCurrentNumber();
        int expected2 = 9;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void numberPrev() {
        Radio cond = new Radio();
        cond.setCurrentNumber(0);

        cond.prev();

        int actual3 = cond.getCurrentNumber();
        int expected3 = 9;
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void numberNext1() {
        Radio cond = new Radio();
        cond.setCurrentNumber(9);

        cond.next();

        int actual2 = cond.getCurrentNumber();
        int expected2 = 0;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void numberPrev2() {
        Radio cond = new Radio();
        cond.setCurrentNumber(4);

        cond.prev();

        int actual3 = cond.getCurrentNumber();
        int expected3 = 3;
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void increaseVolume3() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);

        cond.increaseVolume();

        int actual2 = cond.getCurrentVolume();
        int expected2 = 6;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void decreaseVolume3() {
        Radio cond = new Radio();
        cond.setCurrentVolume(3);

        cond.decreaseVolume();

        int actual2 = cond.getCurrentVolume();
        int expected2 = 2;
        Assertions.assertEquals(expected2, actual2);

    }

    @Test
    void increaseVolume4() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        cond.increaseVolume();

        int actual2 = cond.getCurrentVolume();
        int expected2 = 10;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void decreaseVolume4() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int actual2 = cond.getCurrentVolume();
        int expected2 = 0;
        Assertions.assertEquals(expected2, actual2);

    }

}
