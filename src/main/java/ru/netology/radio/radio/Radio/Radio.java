package ru.netology.radio.radio.Radio;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int stationAmount = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > stationAmount - 1) {
            currentStation = stationAmount - 1;
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int getStationAmount() {
        return stationAmount;
    }

    public void setStationAmount(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public Radio() {

    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int nextStation() {
        if (currentStation < stationAmount - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = stationAmount - 1;
        }
        return currentStation;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}