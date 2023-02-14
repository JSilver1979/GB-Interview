package ru.gb.interview.jSilver.lesson1.polimorfism;

import ru.gb.interview.jSilver.lesson1.polimorfism.Polimorf;

public class Triangle extends Polimorf {
    @Override
    public void getType() {
        System.out.println("This is Triangle");
    }
}
