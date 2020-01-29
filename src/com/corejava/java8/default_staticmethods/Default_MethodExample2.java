package com.corejava.java8.default_staticmethods;

import com.corejava.util.MyLogger;

interface MyInterface {

    default void newMethod() {
        MyLogger.consoleLogger.info("Newly added default method");
    }

    void existingMethod(String str);
}

interface MyInterface2 {

    default void newMethod() {
        MyLogger.consoleLogger.info("Newly added default method");
    }

    void disp(String str);
}

public class Default_MethodExample2 implements MyInterface, MyInterface2 {
    // implementing abstract methods
    public void existingMethod(String str) {
        MyLogger.consoleLogger.info("String is: " + str);
    }

    public void disp(String str) {
        MyLogger.consoleLogger.info("String is: " + str);
    }

    //Implementation of duplicate default method
    public void newMethod() {
        MyLogger.consoleLogger.info("Implementation of default method");
    }

    public static void main(String[] args) {
       Default_MethodExample2 obj = new Default_MethodExample2();

        //calling the default method of interface
        obj.newMethod();
        obj.disp("Avinash" );
        obj.existingMethod("Riyaz");

    }
}


