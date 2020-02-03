package com.corejava.java8.Methodref.example;

import com.corejava.util.MyLogger;

interface Sayable {
    void say();
}

public class MethodRef_StaticMethodExmp2 {
    public static void saySomething() {
        MyLogger.consoleLogger.info("Hello, this is static method.");
    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodRef_StaticMethodExmp2::saySomething;
        // Calling interface method
        sayable.say();
    }
}
