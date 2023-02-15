package ru.gb.interview.jSilver.lesson1.errors;

public class Engine {
    private String type;
    private int horsePower;

    boolean isStarted;

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
        this.isStarted = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
