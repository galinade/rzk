package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;
    private int currentNumber;
    private int minNumber;
    private int maxNumber = 9;


    public Radio(int number) {
        this.maxNumber = minNumber + number - 1;

    }

    public Radio() {

    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < minNumber) {
            return;
        }
        if (currentNumber > maxNumber) {
            return;
        }
        this.currentNumber = currentNumber;
    }


    public void next() {
        if (currentNumber == maxNumber) {
            currentNumber = minNumber;
            return;
        }

        currentNumber = currentNumber + 1;
    }


    public void prev() {
        if (currentNumber == minNumber) {
            currentNumber = maxNumber;
            return;
        }

        currentNumber = currentNumber - 1;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}

