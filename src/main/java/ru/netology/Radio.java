package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minNumberRadioStation) {
            return;
        } else if (currentRadioStation > maxNumberRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        } else if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume= currentVolume;
    }

    public int getMaxNumberRadioStation() {

        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {

        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {

        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {

        this.minNumberRadioStation = minNumberRadioStation;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public void setMaxVolume (int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume (int minVolume) {

        this.minVolume = minVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

}