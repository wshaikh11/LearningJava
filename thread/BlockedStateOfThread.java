package org.git.thread;

public class BlockedStateOfThread implements Runnable {

    synchronized public void demo(){
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        demo();
    }

    public static void main(String[] args) {
        BlockedStateOfThread b1 = new BlockedStateOfThread();
        Thread thread1 = new Thread(b1);
        Thread thread2 = new Thread(b1);
        thread1.setName("abc");
        thread2.setName("xyz");
        thread1.start();
        thread2.start();

    }

}
