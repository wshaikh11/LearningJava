package org.git.thread;

public class SynchronizationThread {


    //class level lock similar to static method
     public void demo(){
        System.out.println(
                Thread.currentThread().getName());
        synchronized (SynchronizationThread.class)
        {
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName());
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName()
                            + " end");
        }

    }

    //object level lock
//   public void demo() {
//       System.out.println(
//               Thread.currentThread().getName());
//        synchronized (this){
//            System.out.println(
//                    "in block "
//                            + Thread.currentThread().getName());
//            System.out.println(
//                    "in block "
//                            + Thread.currentThread().getName()
//                            + " end");
//        }
//    }

    public static void main(String[] args) {

        SynchronizationThread synchronizationThread1 = new SynchronizationThread();
        SynchronizationThread synchronizationThread2 = new SynchronizationThread();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizationThread1.demo();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizationThread1.demo();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizationThread2.demo();
            }
        });

        thread1.setName("t1");
        thread2.setName("t2");
        thread3.setName("t3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
