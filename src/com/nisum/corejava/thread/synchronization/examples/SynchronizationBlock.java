package com.nisum.corejava.thread.synchronization.examples;

class Table1 {

    void printTable(int num) {
        //synchronized block
        synchronized (this) {
            for (int loop = 1; loop <= 5; loop++) {
                System.out.println(num * loop);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class Mythread1 extends Thread {
    Table thread1;

    Mythread1(Table thread1) {
        this.thread1 = thread1;
    }

    public void run() {
        thread1.printTable(5);
    }

}

class Mythread2 extends Thread {
    Table thread2;

    Mythread2(Table thread2) {
        this.thread2 = thread2;
    }

    public void run() {
        thread2.printTable(100);
    }
}

public class SynchronizationBlock {
    public static void main(String args[]) {
        Table obj = new Table();//only one object
        MyThread1 tobj1 = new MyThread1(obj);
        MyThread2 tobj2 = new MyThread2(obj);
        tobj1.start();
        tobj2.start();
    }
}