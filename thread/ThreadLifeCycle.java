package org.git.thread;
class ThreadLifeCycle1 {


    synchronized public void demo1() throws InterruptedException {
        System.out.println("in wait");
        wait();
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }

     synchronized public void demo2() throws InterruptedException {
         System.out.println("in notify");
         notify();
         System.out.println("after");
         for (int i = 0; i <= 5; i++) {
             System.out.println(i + " " + Thread.currentThread().getName());
         }
     }

}

public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle1 threadLifeCycle1 = new ThreadLifeCycle1();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threadLifeCycle1.demo1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threadLifeCycle1.demo2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.setName("abc");
        thread1.start();
        thread2.setName("xyz");
        thread2.start();


    }
}


