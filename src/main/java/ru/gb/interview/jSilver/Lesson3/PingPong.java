package ru.gb.interview.jSilver.Lesson3;

public class PingPong implements Runnable{
    private Object monitor;
    private String state;

    public PingPong(Object monitor, String state) {
        this.monitor = monitor;
        this.state = state;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            for (int i = 0; i < 10; i++) {
                System.out.println(state);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                monitor.notify();

                try {
                    monitor.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
