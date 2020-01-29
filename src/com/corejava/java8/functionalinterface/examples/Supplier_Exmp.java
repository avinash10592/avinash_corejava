package com.corejava.java8.functionalinterface.examples;

import com.corejava.util.MyLogger;

import java.util.function.Supplier;

public class Supplier_Exmp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello!! How are you ";
        MyLogger.consoleLogger.info(supplier.get());

        Supplier<Double> randomnum = () -> Math.random();
        MyLogger.consoleLogger.info(randomnum.get());
    }
}
