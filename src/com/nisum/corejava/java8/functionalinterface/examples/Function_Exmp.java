package com.nisum.corejava.java8.functionalinterface.examples;

import java.util.function.Function;

public class Function_Exmp {
    public static void main(String[] args) {
        Function<Integer, Integer> num = number -> number * 2;
        System.out.println(num.apply(8));
    }
}
