package org.git.thread;

public class ThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("in run");
    }
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
    }
}
