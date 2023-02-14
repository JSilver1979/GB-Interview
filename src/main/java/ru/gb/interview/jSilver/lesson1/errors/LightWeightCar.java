package ru.gb.interview.jSilver.lesson1.errors;

class LightWeightCar extends Car implements Moveable {
    @Override
    public void open() {
        System.out.println("Car is open");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void close() {
        System.out.println("Car is closed");
    }
}
