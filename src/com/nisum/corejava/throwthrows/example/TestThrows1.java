package com.nisum.corejava.throwthrows.example;


import java.io.IOException;

class Testthrows1 {
    void run1() throws IOException {
        throw new IOException("device error");//checked exception
    }

    void run2() throws IOException {
        run1();
    }

    void run3() {
        try {
            run2();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        Testthrows1 obj = new Testthrows1();
        obj.run3();
        System.out.println("normal flow...");
    }
}

