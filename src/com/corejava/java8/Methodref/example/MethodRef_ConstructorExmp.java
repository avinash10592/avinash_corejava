package com.corejava.java8.Methodref.example;

import com.corejava.util.MyLogger;

import java.util.function.BiConsumer;

class MathOperations {

    public MathOperations(int a, int b) {
        MyLogger.consoleLogger.info("Sum of " + a + " and " + b + " is " + (a + b));
    }
}

/***** Reference To A Constructor *****/
public class MethodRef_ConstructorExmp {
    public static void main(String[] args) {

        /**** Using Lambda Expression ****/
        MyLogger.consoleLogger.info("\n--------------------Using Lambda Expression----------------------");
        BiConsumer<Integer, Integer> addtion1 = (a, b) -> new MathOperations(a, b);
        addtion1.accept(10, 20);

        /**** Using Method Reference ****/
        MyLogger.consoleLogger.info("\n---------------------Using Method Reference---------------------");
        BiConsumer<Integer, Integer> addtion2 = MathOperations::new;
        addtion2.accept(50, 20);
    }
}
