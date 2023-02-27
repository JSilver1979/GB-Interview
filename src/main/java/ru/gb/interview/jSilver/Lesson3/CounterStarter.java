package ru.gb.interview.jSilver.Lesson3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class CounterStarter {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Counter(lock));
        }
        executorService.shutdown();
    }
}
