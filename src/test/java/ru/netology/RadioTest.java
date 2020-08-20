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
    public void shouldGetAndSetCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(0);
        assertEquals(0, radio.getCurrentVolumeSound());
        radio.setCurrentVolumeSound(50);
        assertEquals(50, radio.getCurrentVolumeSound());
        radio.setCurrentVolumeSound(100);
        assertEquals(100, radio.getCurrentVolumeSound());
        radio.setCurrentVolumeSound(-1);
        assertEquals(0, radio.getCurrentVolumeSound());
        radio.setCurrentVolumeSound(110);
        assertEquals(100, radio.getCurrentVolumeSound());
    }

    @Test
    public void shouldGetAndSetMaxVolumeSound() {
        Radio radio = new Radio();
        assertEquals(100, radio.getMaxVolumeSound());
    }

    @Test
    public void shouldGetAndSetMinVolumeSound() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinVolumeSound());
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
    public void shouldIncreaseCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(40);
        radio.increaseCurrentVolumeSound();
        assertEquals(41,radio.getCurrentVolumeSound());
    }

    @Test
    public void shouldDecreaseCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(40);
        radio.decreaseCurrentVolumeSound();
        assertEquals(39,radio.getCurrentVolumeSound());
    }

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

}