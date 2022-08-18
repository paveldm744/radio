package ru.netology.radio.radio.Radio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(10);

    @Test
    void shouldNextStation() {
        rad.setCurrentStation(8);
        rad.nextStation();
        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test
    void shouldNextStationOnMax() {
        rad.setCurrentStation(9);
        rad.nextStation();
        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    void shouldNextStationAfterMax() {
        rad.setCurrentStation(10);
        rad.nextStation();
        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        rad.setCurrentStation(9);
        rad.prevStation();

        Assertions.assertEquals(8, rad.getCurrentStation());
    }

    @Test
    void shouldPrevStationOnZero() {
        rad.setCurrentStation(0);
        rad.prevStation();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test
    void shouldPrevStationBeforeZero() {
        rad.setCurrentStation(-1);
        rad.prevStation();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test
    void shouldSetStation() {
        rad.setCurrentStation(4);
        Assertions.assertEquals(4, rad.getCurrentStation());
    }

    @Test
    void shouldSetAboveMaxStation() {
        rad.setCurrentStation(10);

        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test
    void shouldSetBelowMinStation() {
        rad.setCurrentStation(-1);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolumePlusOne() {
        rad.setCurrentVolume(0);
        rad.increaseVolume();

        Assertions.assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    void shouldIncreaseMaxVolume() {
        rad.setCurrentVolume(100);
        rad.increaseVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    void shouldReduceVolumeMinusOne() {
        rad.setCurrentVolume(5);
        rad.reduceVolume();

        Assertions.assertEquals(4, rad.getCurrentVolume());
    }

    @Test
    void shouldReduceMinVolume() {
        rad.setCurrentVolume(0);
        rad.reduceVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    void shouldReduceBelowMinVolume() {
        rad.setCurrentVolume(-1);
        rad.reduceVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    void shouldIncreaseAboveMaxVolume() {
        rad.setCurrentVolume(101);
        rad.increaseVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }
}
