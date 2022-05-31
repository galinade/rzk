package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentNumber;

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > 9) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getCurrentNumber() {

        return currentNumber;
    }

    public void next() {
        if (currentNumber == 9) {
            currentNumber = 0;
            return;
        }

        currentNumber = currentNumber + 1;
    }


    public void prev() {
        if (currentNumber == 0) {
            currentNumber = 9;
            return;
        }

        currentNumber = currentNumber - 1;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}

