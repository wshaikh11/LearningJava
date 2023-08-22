package org.git.thread;

public class DaemonThread extends Thread{

    @Override
    public void run(){
        for(int i=0;i<999;i++){

            System.out.println(i +" " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("deamonThread");
        daemonThread.setDaemon(true);

        daemonThread.start();
        for (int i=0;i<10;i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
