package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetAndSetCurrentRadioStation() {

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetCurrentVolume() {

        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());

        radio.setCurrentVolume(9);
        assertEquals(9, radio.getCurrentVolume());

        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        assertEquals(10, radio.getCurrentVolume());

        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetAndSetMaxVolume() {
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());

        radio.setMaxVolume(9);
        assertEquals(9, radio.getMaxVolume());
    }

    @Test
    public void shouldGetAndSetMinVolume() {
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());

        radio.setMinVolume(1);
        assertEquals(1, radio.getMinVolume());
    }

    @Test
    public void shouldGetAndSetMaxNumberRadioStation() {
        radio.setMaxNumberRadioStation(9);
        assertEquals(9, radio.getMaxNumberRadioStation());

        radio.setMaxNumberRadioStation(8);
        assertEquals(8, radio.getMaxNumberRadioStation());
    }

    @Test
    public void shouldGetAndSetMinNumberRadioStation() {
        radio.setMinNumberRadioStation(9);
        assertEquals(9, radio.getMinNumberRadioStation());

        radio.setMinNumberRadioStation(8);
        assertEquals(8, radio.getMinNumberRadioStation());
    }


    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10,radio.getCurrentVolume());

        radio.setCurrentVolume(9);
        radio.increaseCurrentVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0,radio.getCurrentVolume());

        radio.setCurrentVolume(1);
        radio.decreaseCurrentVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    public void shouldRemoteNumberRadioStation() {
        int [] possibleNumberRadioStation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        radio.setCurrentRadioStation(possibleNumberRadioStation[0]);
        assertEquals(possibleNumberRadioStation[0], radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[9]);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[1]);
        assertEquals(1, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[4]);
        assertEquals(4, radio.getCurrentRadioStation());
    }

}