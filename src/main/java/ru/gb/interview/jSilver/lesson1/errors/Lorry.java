package ru.gb.interview.jSilver.lesson1.errors;


public class Lorry extends Car implements Moveable, Stopable {
    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    public void open() {
        System.out.println("Open");
    }

    @Override
    public void close() {
        System.out.println("Close");
    }
}