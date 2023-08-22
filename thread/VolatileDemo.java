package org.git.thread;

import java.util.logging.Logger;

public class VolatileDemo {

    private volatile static int MY_INT = 0;

    static class ChangeListener extends Thread{
        @Override
        public void run(){
            int local_value = MY_INT;
            while (local_value < 5) {
                if (local_value != MY_INT) {
                    System.out.println("Got Change for MY_INT : {0}"+ MY_INT);
                    local_value = MY_INT;
                }
            }

        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run(){
            int local_value = MY_INT;
            while (MY_INT < 5){
                System.out.println("Incrementing local value" +" "+ local_value );
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void main(String[] args) {

        new ChangeListener().start();
        new ChangeMaker().start();
    }
}
