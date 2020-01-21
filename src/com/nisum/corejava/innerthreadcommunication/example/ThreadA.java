package com.nisum.corejava.innerthreadcommunication.example;

public class ThreadA {
    public static void main(String[] args) {
        ThreadB thb = new ThreadB();
        thb.start();
        synchronized (thb) {
            System.out.println("Main thread trying to call wait() method");
            try {
                thb.wait();
            } catch (InterruptedException e) {}

            System.out.println("Main Thread got notification");
            System.out.println(thb.total);
        }
    }
}

class ThreadB extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Child thread starts calculation");
            for (int loop = 1; loop <= 100; loop++) {
                total = total + loop;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }
    }
}