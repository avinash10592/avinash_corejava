package com.nisum.corejava.java8.default_staticmethods;

interface MyInterface {

    default void newMethod() {
        System.out.println("Newly added default method");
    }

    void existingMethod(String str);
}

interface MyInterface2 {

    default void newMethod() {
        System.out.println("Newly added default method");
    }

    void disp(String str);
}

public class Default_MethodExample2 implements MyInterface, MyInterface2 {
    // implementing abstract methods
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public void disp(String str) {
        System.out.println("String is: " + str);
    }

    //Implementation of duplicate default method
    public void newMethod() {
        System.out.println("Implementation of default method");
    }

    public static void main(String[] args) {
       Default_MethodExample2 obj = new Default_MethodExample2();

        //calling the default method of interface
        obj.newMethod();
        obj.disp("Avinash" );
        obj.existingMethod("Riyaz");

    }
}


