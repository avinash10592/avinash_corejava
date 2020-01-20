package com.nisum.corejava.staticblock.examples;

public class StaticMethod {
    static int num = 100;
    static String s = "Avinash";

    //Static method
    static void display() {
        System.out.println("number:" + num);
        System.out.println("String:" + s);
    }

    //non-static method
    void funcn() {
        //Static method called in non-static method
        display();
    }

    //static method
    public static void main(String args[]) {
        StaticMethod obj = new StaticMethod();
        //You need to have object to call this non-static method
        obj.funcn();

        //Static method called in another static method
        display();
    }
}
