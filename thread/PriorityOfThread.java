package org.git.thread;

public class PriorityOfThread extends Thread{

    @Override
    public void run(){
        System.out.println("in run method" + " " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        PriorityOfThread t1 = new PriorityOfThread();
        PriorityOfThread t2 = new PriorityOfThread();
        PriorityOfThread t3 = new PriorityOfThread();


        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();




    }
}

