package com.corejava.java8.Methodref.example;

import com.corejava.util.MyLogger;

import java.util.function.BiFunction;

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a * b;
    }

    public static float add(float a, float b) {
        return a + b;
    }
}

public class MethodRef_StaticMethodExmp1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 30.0f);
        float result3 = adder3.apply(10.0f, 20.0f);
        MyLogger.consoleLogger.info(result1);
        MyLogger.consoleLogger.info(result2);
        MyLogger.consoleLogger.info(result3);
    }

}
