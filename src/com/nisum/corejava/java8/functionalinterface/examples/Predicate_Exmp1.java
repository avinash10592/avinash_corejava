package com.nisum.corejava.java8.functionalinterface.examples;

import com.nisum.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Exmp1 {
    public static void main(String[] args) {

        Predicate <Integer> even= number-> number %2==0;
        MyLogger.consoleLogger.info(even.test(7));

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list1.forEach(num -> MyLogger.consoleLogger.info(num % 2 == 0));

    }
}
