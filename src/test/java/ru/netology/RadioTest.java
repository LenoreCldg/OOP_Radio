package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    @Test
    public void shouldGetAndSetCurrentRadioStation() {
        Radio radio = new Radio(11,-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(110);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetAndSetMaxVolume() {
        Radio radio = new Radio();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldGetAndSetMinVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldGetAndSetMaxNumberRadioStation() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxNumberRadioStation());
    }

    @Test
    public void shouldGetAndSetMinNumberRadioStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinNumberRadioStation());

    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        radio.increaseCurrentVolume();
        assertEquals(41,radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        radio.decreaseCurrentVolume();
        assertEquals(39,radio.getCurrentVolume());

        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    //возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 10)
    @Test
    public void shouldRemoteNumberRadioStation() {
        Radio radio = new Radio();
        int [] possibleNumberRadioStation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        radio.setCurrentRadioStation(possibleNumberRadioStation[0]);
        assertEquals(possibleNumberRadioStation[0], radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[10]);
        assertEquals(10, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[1]);
        assertEquals(1, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(possibleNumberRadioStation[5]);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void switchNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.switchNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void switchPreviousRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.switchPreviousRadioStation();
        assertEquals(10,radio.getCurrentRadioStation());
    }
}