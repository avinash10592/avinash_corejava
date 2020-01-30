package com.corejava.java8.functionalinterface.examples;

import com.corejava.util.MyLogger;

import java.util.function.Consumer;

public class Consumer_exmp {
    public static void main(String[] args) {

        Consumer<Integer> consumer= number->
                MyLogger.consoleLogger.info("Print: "+number);
        consumer.accept(4);
    }
}