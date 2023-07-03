package com.fengh;

public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThreadRunnable t2 = new MyThreadRunnable();
        Thread t3 = new Thread(t2);
        // Start thread 1
            //t1.run();
            t1.start();
        // Start thread 2
            //t2.run();
            t3.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("Thread 1 : extends Thread --> "+i);
        }
    }
}

class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("Thread 2 : implements Runnable --> "+i);
        }
    }
}
