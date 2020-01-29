package com.corejava.thread.synchronization.examples;

class Table2 {

    synchronized static void printTable(int num) {
        for (int loop = 1; loop <= 10; loop++) {
            System.out.println(num * loop);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class MyThread3 extends Thread {
    public void run() {
        Table.printTable(1);
    }
}

class MyThread4 extends Thread {
    public void run() {
        Table.printTable(10);
    }
}
class MyThread5 extends Thread {
    public void run() {
        Table.printTable(100);
    }
}

public class SynchronizationStaticblock {
    public static void main(String args[]) {
        MyThread3 tobj1 = new MyThread3();
        MyThread4 tobj2 = new MyThread4();
        MyThread5 tobj3 = new MyThread5();
        tobj1.start();
        tobj2.start();
        tobj3.start();

    }
}
