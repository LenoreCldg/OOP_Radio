package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxNumberRadioStation = 10;
    private int minNumberRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int maxNumberRadioStation, int minNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
        this.minNumberRadioStation = minNumberRadioStation;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minNumberRadioStation) {
            return;
        } else if (currentRadioStation > maxNumberRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
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