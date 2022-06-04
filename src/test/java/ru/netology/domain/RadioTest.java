package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void numberN() {
        Radio cond = new Radio(17);

        Assertions.assertEquals(16, cond.getMaxNumber());
    }

    @Test
    void soundMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(101);
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
    void numberNext5() {
        Radio cond = new Radio();
        cond.setCurrentNumber(11);

        cond.next();

        int actual2 = cond.getCurrentNumber();
        int expected2 = 1;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void numberNext3() {
        Radio cond = new Radio();
        cond.setCurrentNumber(-11);

        cond.next();

        int actual2 = cond.getCurrentNumber();
        int expected2 = 1;
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
    void numberNext2() {
        Radio cond = new Radio();
        cond.setCurrentNumber(5);

        cond.next();

        int actual2 = cond.getCurrentNumber();
        int expected2 = 6;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void numberPrev2() {
        Radio cond = new Radio();
        cond.setCurrentNumber(1);

        cond.prev();

        int actual3 = cond.getCurrentNumber();
        int expected3 = 0;
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void numberPrev3() {
        Radio cond = new Radio();
        cond.setCurrentNumber(9);

        cond.prev();

        int actual3 = cond.getCurrentNumber();
        int expected3 = 8;
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void numberPrev4() {
        Radio cond = new Radio();
        cond.setCurrentNumber(-8);

        cond.prev();

        int actual3 = cond.getCurrentNumber();
        int expected3 = 9;
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
        cond.setCurrentVolume(100);

        cond.increaseVolume();

        int actual2 = cond.getCurrentVolume();
        int expected2 = 100;
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void increaseVolume5() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.increaseVolume();

        int actual2 = cond.getCurrentVolume();
        int expected2 = 1;
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

    @Test
    void decreaseVolume5() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        cond.decreaseVolume();

        int actual2 = cond.getCurrentVolume();
        int expected2 = 99;
        Assertions.assertEquals(expected2, actual2);

    }

}
