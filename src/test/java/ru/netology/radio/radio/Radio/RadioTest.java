package ru.netology.radio.radio.Radio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void shouldNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        rad.nextStation();
        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationAfterNine() {
        Radio rad = new Radio();
        rad.currentStation = 10;
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        rad.prevStation();
        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationBeforeZero() {
        Radio rad = new Radio();
        rad.currentStation = -1;
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetAboveMaxStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetBelowMinStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumePlusOne() {
        Radio rad = new Radio();
        rad.currentVolume = 5;
        rad.increaseVolume();
        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseMaxVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 10;
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolumeMinusOne() {
        Radio rad = new Radio();
        rad.currentVolume = 5;
        rad.reduceVolume();
        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceMinVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 0;
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
