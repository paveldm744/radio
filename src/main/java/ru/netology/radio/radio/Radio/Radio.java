package ru.netology.radio.radio.Radio;

public class Radio {
    public int currentVolume;
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public int nextStation() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation >= 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9 && newCurrentStation >= 0) {
            currentStation = newCurrentStation;
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}