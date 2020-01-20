package com.nisum.corejava.staticblock.examples;

public class StaticVariable {
    //Static integer variable
    static int var1 = 77;
    //non-static string variable
    String var2;

    public static void main(String args[]) {
        StaticVariable ob1 = new StaticVariable();
        StaticVariable ob2 = new StaticVariable();

        //Assigning the value to static variable using object ob1
        ob1.var1 = 88;
        ob1.var2 = "I'm Object1";
        /* This will overwrite the value of var1 because var1 has a single
         * copy shared among both the objects.
         */
        ob2.var1 = 99;
        ob2.var2 = "I'm Object2";
        System.out.println("ob1 integer:" + ob1.var1);
        System.out.println("ob1 String:" + ob1.var2);
        System.out.println("ob2 integer:" + ob2.var1);
        System.out.println("ob2 STring:" + ob2.var2);

    }
}