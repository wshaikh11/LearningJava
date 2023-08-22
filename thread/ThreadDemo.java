package org.git.thread;

public class ThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("In run");
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        thread.start();
    }
}
