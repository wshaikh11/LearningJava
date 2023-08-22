package org.git.thread;

public class ThreadWithLambda {
    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("in run");
//        runnable.run();

        Thread thread = new Thread(() -> System.out.println("in run"));

        thread.start();

    }

}

