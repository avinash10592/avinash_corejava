package com.nisum.corejava.java8.default_staticmethods;

interface TestInterface {
    // abstract method
    public void square(int sq);

    // static method
    static void show() {
        System.out.println("Static Method Executed");
    }
}

class Static_methodExample implements TestInterface {
    // Implementation of square abstract method
    public void square(int sq) {
        System.out.println(sq * sq);
    }

    public static void main(String args[]) {
        Static_methodExample obj = new Static_methodExample();
        obj.square(4);

        // Static method executed
        TestInterface.show();
    }
}

