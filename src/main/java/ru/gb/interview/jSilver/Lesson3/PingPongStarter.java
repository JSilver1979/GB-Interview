package ru.gb.interview.jSilver.Lesson3;

public class PingPongStarter {
    public static void main(String[] args) {

        Object monitor = new Object();

        Thread ping = new Thread(new PingPong(monitor, "Ping"));
        Thread pong = new Thread(new PingPong(monitor, "Pong"));

        ping.start();
        pong.start();

    }
}
