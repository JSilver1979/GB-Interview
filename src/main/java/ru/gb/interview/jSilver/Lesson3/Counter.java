package ru.gb.interview.jSilver.Lesson3;

import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {
    private ReentrantLock lock;
    private static volatile int counter = 0;
    private static final int COUNTER_LIMIT = 100;

    public Counter(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (counter < COUNTER_LIMIT) {
            increaseCounter();
        }
    }

    private void increaseCounter() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter++;
        } finally {
            lock.unlock();
        }
    }
}
