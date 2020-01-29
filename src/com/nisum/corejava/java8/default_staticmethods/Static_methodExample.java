package com.nisum.corejava.java8.default_staticmethods;

import com.nisum.corejava.util.MyLogger;

interface TestInterface {
    // abstract method
    public void square(int sq);

    // static method
    static void show() {
        MyLogger.consoleLogger.info("Static Method Executed");
    }
}

class Static_methodExample implements TestInterface {
    // Implementation of square abstract method
    public void square(int sq) {
        MyLogger.consoleLogger.info(sq * sq);
    }

    public static void main(String args[]) {
        Static_methodExample obj = new Static_methodExample();
        obj.square(4);

        // Static method executed
        TestInterface.show();
    }
}

