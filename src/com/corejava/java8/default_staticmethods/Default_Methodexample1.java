package com.corejava.java8.default_staticmethods;

import com.corejava.util.MyLogger;

interface Phone {
    void call();
    default void message() {
        MyLogger.consoleLogger.info("Sent");
    }
}

//class Androidphone implements Phone {
//    public void call() {
//        System.out.println("Calling");
//    }
//}

public class Default_Methodexample1 {
    public static void main(String[] args) {
//        Phone ph = new Androidphone();
//        ph.call();
//        ph.message();
//        Phone ph= new Phone() {
//            @Override
//            public void call() {
//                System.out.println("Calling");
//            }
//        };
//        ph.call();
        Phone ph= ()->{
            MyLogger.consoleLogger.info("Calling");
        };
        ph.call();
    }
}
