package com.corejava.java8.Methodref.example;

import com.corejava.util.MyLogger;

import java.util.function.BiFunction;

class MathOperation {

    /**** Addition ****/
    public int add(int a, int b) {
        return a + b;
    }

    /**** Subtraction ****/
    public int sub(int a, int b) {
        return a - b;
    }
}

public class MethodRef_InstanceMethod {
    public static void main(String[] args) {

        MathOperation operation = new MathOperation();

        /**** Using Lambda Expression ****/
        MyLogger.consoleLogger.info("\n--------------------Using Lambda Expression----------------------");
        BiFunction<Integer, Integer, Integer> add1 = (a, b) -> operation.add(a, b);
        MyLogger.consoleLogger.info("Addtion = " + add1.apply(4, 5));

        BiFunction<Integer, Integer, Integer> sub1 = (a, b) -> operation.sub(a, b);
        MyLogger.consoleLogger.info("Subtraction = " + sub1.apply(58, 5));

        /**** Using Method Reference ****/
        MyLogger.consoleLogger.info("\n---------------------Using Method Reference---------------------");
        BiFunction<Integer, Integer, Integer> add2 = operation::add;
        MyLogger.consoleLogger.info("Addtion = " + add2.apply(4, 5));

        BiFunction<Integer, Integer, Integer> sub2 = operation::sub;
        MyLogger.consoleLogger.info("Subtraction = " + sub2.apply(58, 5));
    }
}
